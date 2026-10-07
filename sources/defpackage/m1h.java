package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m1h extends l40 {
    public final wyg d;
    public final long e;
    public final String f;
    public final long g;

    public m1h(wyg wygVar, long j, String str, long j2, boolean z, boolean z2) {
        super(w50.STORY_REPLY, z, z2);
        this.d = wygVar;
        this.e = j;
        this.f = str;
        this.g = j2;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        HashMap mapA = super.a();
        mapA.put("owner", this.d.a());
        mapA.put("storyId", Long.valueOf(this.e));
        return mapA;
    }
}
