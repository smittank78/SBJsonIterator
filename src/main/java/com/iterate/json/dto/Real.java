package com.iterate.json.dto;

import java.util.List;

public class Real {
	private int id;
	private String organizationname;
	private int leftbound;
	private int rightbound;
	private int depth;
	
	private int scorecardCount;
	private int meetingCount;
	private int performanceChartCount;
	private int actionCount;
	private int documentCount;
	
	private int ytdcalid;
	private String timezone;
	private String elt;
	private String businessowner;
	private String relationshipowner;
	private List<Real> organizationNodes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrganizationname() {
		return organizationname;
	}
	public void setOrganizationname(String organizationname) {
		this.organizationname = organizationname;
	}
	public int getLeftbound() {
		return leftbound;
	}
	public void setLeftbound(int leftbound) {
		this.leftbound = leftbound;
	}
	public int getRightbound() {
		return rightbound;
	}
	public void setRightbound(int rightbound) {
		this.rightbound = rightbound;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getScorecardCount() {
		return scorecardCount;
	}
	public void setScorecardCount(int scorecardCount) {
		this.scorecardCount = scorecardCount;
	}
	public int getMeetingCount() {
		return meetingCount;
	}
	public void setMeetingCount(int meetingCount) {
		this.meetingCount = meetingCount;
	}
	public int getPerformanceChartCount() {
		return performanceChartCount;
	}
	public void setPerformanceChartCount(int performanceChartCount) {
		this.performanceChartCount = performanceChartCount;
	}
	public int getActionCount() {
		return actionCount;
	}
	public void setActionCount(int actionCount) {
		this.actionCount = actionCount;
	}
	public int getDocumentCount() {
		return documentCount;
	}
	public void setDocumentCount(int documentCount) {
		this.documentCount = documentCount;
	}
	public int getYtdcalid() {
		return ytdcalid;
	}
	public void setYtdcalid(int ytdcalid) {
		this.ytdcalid = ytdcalid;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getElt() {
		return elt;
	}
	public void setElt(String elt) {
		this.elt = elt;
	}
	public String getBusinessowner() {
		return businessowner;
	}
	public void setBusinessowner(String businessowner) {
		this.businessowner = businessowner;
	}
	public String getRelationshipowner() {
		return relationshipowner;
	}
	public void setRelationshipowner(String relationshipowner) {
		this.relationshipowner = relationshipowner;
	}
	
	public List<Real> getOrganizationNodes() {
		return organizationNodes;
	}
	public void setOrganizationNodes(List<Real> organizationNodes) {
		this.organizationNodes = organizationNodes;
	}
	@Override
	public String toString() {
		return "Real [id:" + id + ", organizationname:" + organizationname + ", leftbound:" + leftbound
				+ ", rightbound:" + rightbound + ", depth:" + depth + ", scorecardCount:" + scorecardCount
				+ ", meetingCount:" + meetingCount + ", performanceChartCount:" + performanceChartCount
				+ ", actionCount:" + actionCount + ", documentCount:" + documentCount + ", ytdcalid:" + ytdcalid
				+ ", timezone:" + timezone + ", elt:" + elt + ", businessowner:" + businessowner
				+ ", relationshipowner:" + relationshipowner + ", organizationNodes:" + organizationNodes + "]";
	}	
}