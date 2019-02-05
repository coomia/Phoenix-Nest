package com.phoenix.ad.mysql.listener;


import com.phoenix.ad.mysql.dto.BinlogRowData;

public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
