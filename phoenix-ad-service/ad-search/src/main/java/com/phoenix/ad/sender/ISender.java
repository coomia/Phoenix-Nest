package com.phoenix.ad.sender;

import com.phoenix.ad.mysql.dto.MySqlRowData;

public interface ISender {

    void sender(MySqlRowData rowData);
}
