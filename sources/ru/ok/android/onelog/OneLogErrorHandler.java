package ru.ok.android.onelog;

/* JADX INFO: loaded from: classes.dex */
public interface OneLogErrorHandler {

    public static class Default implements OneLogErrorHandler {
    }

    default void handleFailedItemStore(Exception exc, OneLogItem oneLogItem) {
    }
}
