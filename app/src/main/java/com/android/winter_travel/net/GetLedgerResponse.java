package com.android.winter_travel.net;

import com.android.winter_travel.db.LedgerItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetLedgerResponse extends BaseResponse {

    @SerializedName("data_list")
    public List<LedgerItem> ledgerItemList;

}