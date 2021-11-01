package com.myspace.risk_analytics_orchestrator;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VarResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String correlationId;
	private java.lang.Boolean allAccounts;
	private java.lang.String entityType;
	private java.lang.String entityId;
	private java.lang.Double confidence;
	private java.util.List<com.myspace.risk_analytics_orchestrator.Result> results;

	public VarResponse() {
	}

	public java.lang.String getCorrelationId() {
		return this.correlationId;
	}

	public void setCorrelationId(java.lang.String correlationId) {
		this.correlationId = correlationId;
	}

	public java.lang.Boolean getAllAccounts() {
		return this.allAccounts;
	}

	public void setAllAccounts(java.lang.Boolean allAccounts) {
		this.allAccounts = allAccounts;
	}

	public java.lang.String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(java.lang.String entityType) {
		this.entityType = entityType;
	}
	public java.lang.String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(java.lang.String entityId) {
		this.entityId = entityId;
	}

	public java.lang.Double getConfidence() {
		return this.confidence;
	}

	public void setConfidence(java.lang.Double confidence) {
		this.confidence = confidence;
	}

	public VarResponse(
			java.lang.String correlationId,
			java.lang.Boolean allAccounts,
			java.lang.String entityType,
			java.lang.Double confidence,
			java.util.List<com.myspace.risk_analytics_orchestrator.Result> results) {
		this.correlationId = correlationId;
		this.allAccounts = allAccounts;
		this.entityType = entityType;
		this.confidence = confidence;
		this.results = results;
	}

	public java.util.List<com.myspace.risk_analytics_orchestrator.Result> getResults() {
		return this.results;
	}

	public void setResults(
			java.util.List<com.myspace.risk_analytics_orchestrator.Result> results) {
		this.results = results;
	}

	public VarResponse(
			java.lang.String correlationId,
			java.lang.Boolean allAccounts,
			java.lang.String entityType,
			java.lang.String entityId,
			java.lang.Double confidence,
			java.util.List<com.myspace.risk_analytics_orchestrator.Result> results) {
		this.correlationId = correlationId;
		this.allAccounts = allAccounts;
		this.entityType = entityType;
		this.entityId = entityId;
		this.confidence = confidence;
		this.results = results;
	}

}