/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.repository.management.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Titouan COMPIEGNE (titouan.compiegne at graviteesource.com)
 * @author Nicolas GERAUD (nicolas.geraud at graviteesource.com)
 * @author GraviteeSource Team
 */
public class Page {
	public enum AuditEvent implements Audit.ApiAuditEvent {
		PAGE_CREATED, PAGE_UPDATED, PAGE_DELETED, PAGE_PUBLISHED
	}

	private String id;
	private String name;
	private PageType type;
	private String content;
	private String lastContributor;
	private int order;
	private boolean published;
	private PageSource source;
	private Map<String, String> configuration;
	private boolean homepage;
	private String api;
	private Date createdAt;
	private Date updatedAt;
	private String parentId;
	private List<String> excludedGroups;
	private Map<String, String> metadata;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PageType getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(PageType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLastContributor() {
		return lastContributor;
	}

	public void setLastContributor(String lastContributor) {
		this.lastContributor = lastContributor;
	}
	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public PageSource getSource() {
		return source;
	}

	public void setSource(PageSource source) {
		this.source = source;
	}

	public Map<String, String> getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Map<String, String> configuration) {
		this.configuration = configuration;
	}

	public boolean isHomepage() {
		return homepage;
	}

	public void setHomepage(boolean homepage) {
		this.homepage = homepage;
	}

	public List<String> getExcludedGroups() {
		return excludedGroups;
	}

	public void setExcludedGroups(List<String> excludedGroups) {
		this.excludedGroups = excludedGroups;
	}

	public String getParentId() { return parentId; }

	public void setParentId(String parentId) { this.parentId = parentId; }

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Page page = (Page) o;
		return Objects.equals(id, page.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Page{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", type=" + type +
				", content='" + content + '\'' +
				", lastContributor='" + lastContributor + '\'' +
				", order=" + order +
				", published=" + published +
				", source=" + source +
				", configuration=" + configuration +
				", homepage=" + homepage +
				", api='" + api + '\'' +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				", parentId='" + parentId + '\'' +
				", excludedGroups=" + excludedGroups +
				", metadata=" + metadata +
				'}';
	}
}
