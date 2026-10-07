package ru.ok.android.onelog;

import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface OneLogAppender extends Flushable {
    void append(OneLogItem oneLogItem);

    @Override // java.io.Flushable
    void flush();
}
