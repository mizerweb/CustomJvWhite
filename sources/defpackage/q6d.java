package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q6d extends l40 {
    public final long d;
    public final String e;
    public final u8b f;
    public final int g;
    public final ed7 h;
    public final int i;

    public q6d(long j, String str, u8b u8bVar, int i, ed7 ed7Var, int i2, boolean z, boolean z2) {
        super(w50.POLL, z, z2);
        this.d = j;
        this.e = str;
        this.f = u8bVar;
        this.g = i;
        this.h = ed7Var;
        this.i = i2;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        ArrayList arrayList = new ArrayList();
        long j = this.d;
        if (j > 0) {
            mapA.put("pollId", Long.valueOf(j));
        }
        u8b u8bVar = this.f;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Collections.singletonMap("text", ((r5d) objArr[i2]).a));
        }
        mapA.put("title", this.e);
        mapA.put("answers", arrayList);
        mapA.put("settings", Integer.valueOf(this.g));
        return mapA;
    }
}
