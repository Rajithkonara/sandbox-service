/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licenses this file to you under  the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.services.dep.sandbox.servicefactory.user;

import java.util.List;

import com.wso2telco.services.dep.sandbox.servicefactory.AbstractReturnWrapperDTO;

public class RetrieveAttributesServiceResponseWrapper extends AbstractReturnWrapperDTO {

    private Attributes attribute;

    @Override
    public Object getResponse() {
	if (getRequestError() != null) {
	    return getRequestError();
	}
	return getAttribute();
    }

    public void setAttribute(Attributes attribute) {
	this.attribute = attribute;
    }

    public Attributes getAttribute() {
	return attribute;
    }

    public static class Attributes {

	private List<String> attributeList;

	public void setAttributes(List<String> attributeList) {
	    this.attributeList = attributeList;
	}

	public List<String> getAttributes() {
	    return attributeList;
	}

    }
   
}
