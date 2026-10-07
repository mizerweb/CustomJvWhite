package defpackage;

import androidx.work.WorkRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vzj {
    public final String a;
    public final String b;
    public final ve6 c;
    public final mzj d;
    public final Set e;
    public final long f;
    public final int g;

    public vzj(String str, ve6 ve6Var, WorkRequest workRequest) {
        this(workRequest.getId().toString(), str, ve6Var, workRequest.getWorkSpec(), workRequest.getTags(), System.currentTimeMillis(), 0);
    }

    public vzj(String str, String str2, ve6 ve6Var, mzj mzjVar, Set set, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = ve6Var;
        this.d = mzjVar;
        this.e = set;
        this.f = j;
        this.g = i;
    }
}
