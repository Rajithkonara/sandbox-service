/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under  the Apache License, Version 2.0 (the "License");
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
package com.wso2telco.services.dep.sandbox.exception;

import com.wso2telco.core.dbutils.exception.BusinessException;
import com.wso2telco.core.dbutils.exception.ThrowableError;

public class SandboxException extends BusinessException {

	private static final long serialVersionUID = 7715516857484240221L;
	
	private String fieldName;

	public SandboxException(ThrowableError error) {
		super(error);
	}
	
	public SandboxException(ThrowableError error, String fieldName) {
		super(error);
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public enum SandboxErrorType implements ThrowableError {
		INVALID_MSISDN("SVC0004","endUserId format invalid."),
		INVALID_INPUT_VALUE("SVC0002","Invalid input value for message part"),
		SERVICE_ERROR("SVC0001","A service error occurred"),
		NO_VALID_SERVICES_AVAILABLE("POL0014","No Valid Services Available");
		
		private String message;
		private String code;
		
		private SandboxErrorType (final String code, final String message) {
			this.message = message;
			this.code = code;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.wso2telco.core.dbutils.exception.ThrowableError#getMessage()
		 */
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return message;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.wso2telco.core.dbutils.exception.ThrowableError#getCode()
		 */
		@Override
		public String getCode() {
			// TODO Auto-generated method stub
			return code;
		}

	}

}
