/*
 * Copyright © 2015-2020 Santer Reply S.p.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.reply.orchestrator.service.commands;

import it.reply.orchestrator.dal.entity.Deployment;
import it.reply.orchestrator.dal.repository.DeploymentRepository;
import it.reply.orchestrator.dto.deployment.BaseWorkflowMessage;

import org.flowable.engine.delegate.DelegateExecution;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseWorkflowCommand<M extends BaseWorkflowMessage> extends BaseJavaDelegate {

  @Autowired
  private DeploymentRepository deploymentRepository;

  protected abstract M getMessage(DelegateExecution execution);

  protected abstract void setMessage(M message, DelegateExecution execution);

  @Override
  public void customExecute(DelegateExecution execution) {
    M message = getMessage(execution);
    execute(execution, message);
    setMessage(message, execution);
  }

  protected abstract void execute(DelegateExecution execution, M message);

  protected Deployment getDeployment(M message) {
    return deploymentRepository.findOne(message.getDeploymentId());
  }

}
