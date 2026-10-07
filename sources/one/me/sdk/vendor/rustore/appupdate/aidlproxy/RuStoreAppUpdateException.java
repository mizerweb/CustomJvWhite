package one.me.sdk.vendor.rustore.appupdate.aidlproxy;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/vendor/rustore/appupdate/aidlproxy/RuStoreAppUpdateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "rustore"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RuStoreAppUpdateException extends Exception {
    public final int a;
    public final Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuStoreAppUpdateException(String str, int i, Integer num, Throwable th, int i2) {
        super(str, (i2 & 8) != 0 ? null : th);
        num = (i2 & 4) != 0 ? null : num;
        this.a = i;
        this.b = num;
    }
}
