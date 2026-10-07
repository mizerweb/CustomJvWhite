package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.mv8;
import defpackage.rx8;
import defpackage.u21;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/api/IterableItemsApiValue;", "Lu21;", "", "", CallAnalyticsApiRequest.KEY_ITEMS, "<init>", "(Ljava/util/Iterator;)V", "Lmv8;", "writer", "Lsbi;", "write", "(Lmv8;)V", "Ljava/util/Iterator;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IterableItemsApiValue extends u21 {
    private final Iterator<String> items;

    public IterableItemsApiValue(Iterator<String> it) {
        this.items = it;
    }

    @Override // defpackage.u21
    public void write(mv8 writer) throws JsonSerializeException, IOException {
        writer.r();
        while (this.items.hasNext()) {
            try {
                try {
                    StringReader stringReader = new StringReader(this.items.next());
                    try {
                        writer.T(stringReader);
                        stringReader.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(stringReader, th);
                            throw th2;
                        }
                    }
                } catch (NoSuchElementException unused) {
                } catch (JsonSyntaxException e) {
                    throw new JsonSerializeException(e);
                }
            } catch (Throwable th3) {
                writer.q();
                throw th3;
            }
        }
        writer.q();
    }
}
