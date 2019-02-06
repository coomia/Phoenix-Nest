package com.phoenix.ad.search;

import com.phoenix.ad.search.vo.SearchRequest;
import com.phoenix.ad.search.vo.SearchResponse;

public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
