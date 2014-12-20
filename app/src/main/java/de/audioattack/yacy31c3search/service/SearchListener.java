package de.audioattack.yacy31c3search.service;

import de.audioattack.yacy31c3search.service.data.SearchItem;

/**
 * Created by low012 on 20.12.14.
 */
public interface SearchListener {

    void onLoadingData();

    void onFinishedData();

    void onError(Exception ex);

    void onNetworkUnavailable();

    void onOldResultCleared();

    void onItemAdded(SearchItem item);
}