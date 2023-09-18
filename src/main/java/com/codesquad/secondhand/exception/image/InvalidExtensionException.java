package com.codesquad.secondhand.exception.image;

import com.codesquad.secondhand.exception.CustomException;
import com.codesquad.secondhand.exception.ErrorResponse;

public class InvalidExtensionException extends CustomException {

	public InvalidExtensionException() {
		super(ErrorResponse.INVALID_EXTENSION_EXCEPTION);
	}

}
