package com.android.winter_travel.net;

import com.google.gson.annotations.SerializedName;

class BaseResponse {

    @SerializedName("error_code")
    public int errorCode;
    @SerializedName("error_message")
    public String errorMessage;
}