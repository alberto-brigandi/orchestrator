/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.18.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.reply.orchestrator.dto.kubernetes.fluxcd;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1HelmReleaseSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-16T10:28:05.581Z[Etc/UTC]")
public class V1HelmReleaseSpec {
  public static final String SERIALIZED_NAME_CHART = "chart";
  @SerializedName(SERIALIZED_NAME_CHART)
  private V1HelmReleaseSpecChart chart;

  public static final String SERIALIZED_NAME_DISABLE_OPEN_A_P_I_VALIDATION = "disableOpenAPIValidation";
  @SerializedName(SERIALIZED_NAME_DISABLE_OPEN_A_P_I_VALIDATION)
  private Boolean disableOpenAPIValidation;

  public static final String SERIALIZED_NAME_FORCE_UPGRADE = "forceUpgrade";
  @SerializedName(SERIALIZED_NAME_FORCE_UPGRADE)
  private Boolean forceUpgrade;

  /**
   * HelmVersion is the version of Helm to target. If not supplied, the lowest _enabled Helm version_ will be targeted. Valid HelmVersion values are: \&quot;v2\&quot;, \&quot;v3\&quot;
   */
  @JsonAdapter(HelmVersionEnum.Adapter.class)
  public enum HelmVersionEnum {
    V2("v2"),
    
    V3("v3");

    private String value;

    HelmVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HelmVersionEnum fromValue(String value) {
      for (HelmVersionEnum b : HelmVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HelmVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HelmVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HelmVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HelmVersionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HELM_VERSION = "helmVersion";
  @SerializedName(SERIALIZED_NAME_HELM_VERSION)
  private HelmVersionEnum helmVersion;

  public static final String SERIALIZED_NAME_MAX_HISTORY = "maxHistory";
  @SerializedName(SERIALIZED_NAME_MAX_HISTORY)
  private Integer maxHistory;

  public static final String SERIALIZED_NAME_RELEASE_NAME = "releaseName";
  @SerializedName(SERIALIZED_NAME_RELEASE_NAME)
  private String releaseName;

  public static final String SERIALIZED_NAME_RESET_VALUES = "resetValues";
  @SerializedName(SERIALIZED_NAME_RESET_VALUES)
  private Boolean resetValues;

  public static final String SERIALIZED_NAME_ROLLBACK = "rollback";
  @SerializedName(SERIALIZED_NAME_ROLLBACK)
  private V1HelmReleaseSpecRollback rollback;

  public static final String SERIALIZED_NAME_SKIP_C_R_DS = "skipCRDs";
  @SerializedName(SERIALIZED_NAME_SKIP_C_R_DS)
  private Boolean skipCRDs;

  public static final String SERIALIZED_NAME_TARGET_NAMESPACE = "targetNamespace";
  @SerializedName(SERIALIZED_NAME_TARGET_NAMESPACE)
  private String targetNamespace;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private V1HelmReleaseSpecTest test;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Long timeout;

  public static final String SERIALIZED_NAME_VALUE_FILE_SECRETS = "valueFileSecrets";
  @SerializedName(SERIALIZED_NAME_VALUE_FILE_SECRETS)
  private List<V1HelmReleaseSpecValueFileSecrets> valueFileSecrets = null;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Object values;

  public static final String SERIALIZED_NAME_VALUES_FROM = "valuesFrom";
  @SerializedName(SERIALIZED_NAME_VALUES_FROM)
  private List<V1HelmReleaseSpecValuesFrom> valuesFrom = null;

  public static final String SERIALIZED_NAME_WAIT = "wait";
  @SerializedName(SERIALIZED_NAME_WAIT)
  private Boolean wait;


  public V1HelmReleaseSpec chart(V1HelmReleaseSpecChart chart) {
    
    this.chart = chart;
    return this;
  }

   /**
   * Get chart
   * @return chart
  **/
  @ApiModelProperty(required = true, value = "")

  public V1HelmReleaseSpecChart getChart() {
    return chart;
  }


  public void setChart(V1HelmReleaseSpecChart chart) {
    this.chart = chart;
  }


  public V1HelmReleaseSpec disableOpenAPIValidation(Boolean disableOpenAPIValidation) {
    
    this.disableOpenAPIValidation = disableOpenAPIValidation;
    return this;
  }

   /**
   * DisableOpenAPIValidation controls whether OpenAPI validation is enforced.
   * @return disableOpenAPIValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DisableOpenAPIValidation controls whether OpenAPI validation is enforced.")

  public Boolean getDisableOpenAPIValidation() {
    return disableOpenAPIValidation;
  }


  public void setDisableOpenAPIValidation(Boolean disableOpenAPIValidation) {
    this.disableOpenAPIValidation = disableOpenAPIValidation;
  }


  public V1HelmReleaseSpec forceUpgrade(Boolean forceUpgrade) {
    
    this.forceUpgrade = forceUpgrade;
    return this;
  }

   /**
   * Force will mark this Helm release to &#x60;--force&#x60; upgrades. This forces the resource updates through delete/recreate if needed.
   * @return forceUpgrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Force will mark this Helm release to `--force` upgrades. This forces the resource updates through delete/recreate if needed.")

  public Boolean getForceUpgrade() {
    return forceUpgrade;
  }


  public void setForceUpgrade(Boolean forceUpgrade) {
    this.forceUpgrade = forceUpgrade;
  }


  public V1HelmReleaseSpec helmVersion(HelmVersionEnum helmVersion) {
    
    this.helmVersion = helmVersion;
    return this;
  }

   /**
   * HelmVersion is the version of Helm to target. If not supplied, the lowest _enabled Helm version_ will be targeted. Valid HelmVersion values are: \&quot;v2\&quot;, \&quot;v3\&quot;
   * @return helmVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HelmVersion is the version of Helm to target. If not supplied, the lowest _enabled Helm version_ will be targeted. Valid HelmVersion values are: \"v2\", \"v3\"")

  public HelmVersionEnum getHelmVersion() {
    return helmVersion;
  }


  public void setHelmVersion(HelmVersionEnum helmVersion) {
    this.helmVersion = helmVersion;
  }


  public V1HelmReleaseSpec maxHistory(Integer maxHistory) {
    
    this.maxHistory = maxHistory;
    return this;
  }

   /**
   * MaxHistory is the maximum amount of revisions to keep for the Helm release. If not supplied, it defaults to 10.
   * @return maxHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MaxHistory is the maximum amount of revisions to keep for the Helm release. If not supplied, it defaults to 10.")

  public Integer getMaxHistory() {
    return maxHistory;
  }


  public void setMaxHistory(Integer maxHistory) {
    this.maxHistory = maxHistory;
  }


  public V1HelmReleaseSpec releaseName(String releaseName) {
    
    this.releaseName = releaseName;
    return this;
  }

   /**
   * ReleaseName is the name of the The Helm release. If not supplied, it will be generated by affixing the namespace to the resource name.
   * @return releaseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReleaseName is the name of the The Helm release. If not supplied, it will be generated by affixing the namespace to the resource name.")

  public String getReleaseName() {
    return releaseName;
  }


  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }


  public V1HelmReleaseSpec resetValues(Boolean resetValues) {
    
    this.resetValues = resetValues;
    return this;
  }

   /**
   * ResetValues will mark this Helm release to reset the values to the defaults of the targeted chart before performing an upgrade. Not explicitly setting this to &#x60;false&#x60; equals to &#x60;true&#x60; due to the declarative nature of the operator.
   * @return resetValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ResetValues will mark this Helm release to reset the values to the defaults of the targeted chart before performing an upgrade. Not explicitly setting this to `false` equals to `true` due to the declarative nature of the operator.")

  public Boolean getResetValues() {
    return resetValues;
  }


  public void setResetValues(Boolean resetValues) {
    this.resetValues = resetValues;
  }


  public V1HelmReleaseSpec rollback(V1HelmReleaseSpecRollback rollback) {
    
    this.rollback = rollback;
    return this;
  }

   /**
   * Get rollback
   * @return rollback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1HelmReleaseSpecRollback getRollback() {
    return rollback;
  }


  public void setRollback(V1HelmReleaseSpecRollback rollback) {
    this.rollback = rollback;
  }


  public V1HelmReleaseSpec skipCRDs(Boolean skipCRDs) {
    
    this.skipCRDs = skipCRDs;
    return this;
  }

   /**
   * SkipCRDs will mark this Helm release to skip the creation of CRDs during a Helm 3 installation.
   * @return skipCRDs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SkipCRDs will mark this Helm release to skip the creation of CRDs during a Helm 3 installation.")

  public Boolean getSkipCRDs() {
    return skipCRDs;
  }


  public void setSkipCRDs(Boolean skipCRDs) {
    this.skipCRDs = skipCRDs;
  }


  public V1HelmReleaseSpec targetNamespace(String targetNamespace) {
    
    this.targetNamespace = targetNamespace;
    return this;
  }

   /**
   * TargetNamespace overrides the targeted namespace for the Helm release. The default namespace equals to the namespace of the HelmRelease resource.
   * @return targetNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TargetNamespace overrides the targeted namespace for the Helm release. The default namespace equals to the namespace of the HelmRelease resource.")

  public String getTargetNamespace() {
    return targetNamespace;
  }


  public void setTargetNamespace(String targetNamespace) {
    this.targetNamespace = targetNamespace;
  }


  public V1HelmReleaseSpec test(V1HelmReleaseSpecTest test) {
    
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1HelmReleaseSpecTest getTest() {
    return test;
  }


  public void setTest(V1HelmReleaseSpecTest test) {
    this.test = test;
  }


  public V1HelmReleaseSpec timeout(Long timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout is the time to wait for any individual Kubernetes operation (like Jobs for hooks) during installation and upgrade operations.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout is the time to wait for any individual Kubernetes operation (like Jobs for hooks) during installation and upgrade operations.")

  public Long getTimeout() {
    return timeout;
  }


  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public V1HelmReleaseSpec valueFileSecrets(List<V1HelmReleaseSpecValueFileSecrets> valueFileSecrets) {
    
    this.valueFileSecrets = valueFileSecrets;
    return this;
  }

  public V1HelmReleaseSpec addValueFileSecretsItem(V1HelmReleaseSpecValueFileSecrets valueFileSecretsItem) {
    if (this.valueFileSecrets == null) {
      this.valueFileSecrets = new ArrayList<V1HelmReleaseSpecValueFileSecrets>();
    }
    this.valueFileSecrets.add(valueFileSecretsItem);
    return this;
  }

   /**
   * ValueFileSecrets holds the local name references to secrets. DEPRECATED, use ValuesFrom.secretKeyRef instead.
   * @return valueFileSecrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ValueFileSecrets holds the local name references to secrets. DEPRECATED, use ValuesFrom.secretKeyRef instead.")

  public List<V1HelmReleaseSpecValueFileSecrets> getValueFileSecrets() {
    return valueFileSecrets;
  }


  public void setValueFileSecrets(List<V1HelmReleaseSpecValueFileSecrets> valueFileSecrets) {
    this.valueFileSecrets = valueFileSecrets;
  }


  public V1HelmReleaseSpec values(Object values) {
    
    this.values = values;
    return this;
  }

   /**
   * Values holds the values for this Helm release.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values holds the values for this Helm release.")

  public Object getValues() {
    return values;
  }


  public void setValues(Object values) {
    this.values = values;
  }


  public V1HelmReleaseSpec valuesFrom(List<V1HelmReleaseSpecValuesFrom> valuesFrom) {
    
    this.valuesFrom = valuesFrom;
    return this;
  }

  public V1HelmReleaseSpec addValuesFromItem(V1HelmReleaseSpecValuesFrom valuesFromItem) {
    if (this.valuesFrom == null) {
      this.valuesFrom = new ArrayList<V1HelmReleaseSpecValuesFrom>();
    }
    this.valuesFrom.add(valuesFromItem);
    return this;
  }

   /**
   * Get valuesFrom
   * @return valuesFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1HelmReleaseSpecValuesFrom> getValuesFrom() {
    return valuesFrom;
  }


  public void setValuesFrom(List<V1HelmReleaseSpecValuesFrom> valuesFrom) {
    this.valuesFrom = valuesFrom;
  }


  public V1HelmReleaseSpec wait(Boolean wait) {
    
    this.wait = wait;
    return this;
  }

   /**
   * Wait will mark this Helm release to wait until all Pods, PVCs, Services, and minimum number of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking the release as successful.
   * @return wait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wait will mark this Helm release to wait until all Pods, PVCs, Services, and minimum number of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking the release as successful.")

  public Boolean getWait() {
    return wait;
  }


  public void setWait(Boolean wait) {
    this.wait = wait;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HelmReleaseSpec v1HelmReleaseSpec = (V1HelmReleaseSpec) o;
    return Objects.equals(this.chart, v1HelmReleaseSpec.chart) &&
        Objects.equals(this.disableOpenAPIValidation, v1HelmReleaseSpec.disableOpenAPIValidation) &&
        Objects.equals(this.forceUpgrade, v1HelmReleaseSpec.forceUpgrade) &&
        Objects.equals(this.helmVersion, v1HelmReleaseSpec.helmVersion) &&
        Objects.equals(this.maxHistory, v1HelmReleaseSpec.maxHistory) &&
        Objects.equals(this.releaseName, v1HelmReleaseSpec.releaseName) &&
        Objects.equals(this.resetValues, v1HelmReleaseSpec.resetValues) &&
        Objects.equals(this.rollback, v1HelmReleaseSpec.rollback) &&
        Objects.equals(this.skipCRDs, v1HelmReleaseSpec.skipCRDs) &&
        Objects.equals(this.targetNamespace, v1HelmReleaseSpec.targetNamespace) &&
        Objects.equals(this.test, v1HelmReleaseSpec.test) &&
        Objects.equals(this.timeout, v1HelmReleaseSpec.timeout) &&
        Objects.equals(this.valueFileSecrets, v1HelmReleaseSpec.valueFileSecrets) &&
        Objects.equals(this.values, v1HelmReleaseSpec.values) &&
        Objects.equals(this.valuesFrom, v1HelmReleaseSpec.valuesFrom) &&
        Objects.equals(this.wait, v1HelmReleaseSpec.wait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, disableOpenAPIValidation, forceUpgrade, helmVersion, maxHistory, releaseName, resetValues, rollback, skipCRDs, targetNamespace, test, timeout, valueFileSecrets, values, valuesFrom, wait);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HelmReleaseSpec {\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    disableOpenAPIValidation: ").append(toIndentedString(disableOpenAPIValidation)).append("\n");
    sb.append("    forceUpgrade: ").append(toIndentedString(forceUpgrade)).append("\n");
    sb.append("    helmVersion: ").append(toIndentedString(helmVersion)).append("\n");
    sb.append("    maxHistory: ").append(toIndentedString(maxHistory)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    resetValues: ").append(toIndentedString(resetValues)).append("\n");
    sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
    sb.append("    skipCRDs: ").append(toIndentedString(skipCRDs)).append("\n");
    sb.append("    targetNamespace: ").append(toIndentedString(targetNamespace)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    valueFileSecrets: ").append(toIndentedString(valueFileSecrets)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    valuesFrom: ").append(toIndentedString(valuesFrom)).append("\n");
    sb.append("    wait: ").append(toIndentedString(wait)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

