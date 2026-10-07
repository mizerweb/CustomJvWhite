package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cid extends yq0 {
    public static final yhh f = new yhh("privacy.restricted", null, null);
    public final /* synthetic */ int c = 0;
    public final long d;
    public final List e;

    public cid(long j, long j2) {
        this(j, Collections.singletonList(Long.valueOf(j2)));
    }

    @Override // defpackage.yq0, defpackage.zq0
    public final String toString() {
        int i = this.c;
        List list = this.e;
        long j = this.d;
        switch (i) {
            case 0:
                return "PrivacyRestrictedError{chatId=" + j + ", contactIds=" + list + '}';
            default:
                return "ControlMessageAddError{chatId=" + j + ", contactIds=" + list + '}';
        }
    }

    public cid(yhh yhhVar, long j, List list) {
        super(yhhVar);
        this.d = j;
        this.e = list;
    }

    public cid(long j, List list) {
        super(f);
        this.d = j;
        this.e = list;
    }
}
