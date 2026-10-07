package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class svd implements y99 {
    public final Uri a;
    public final lkg b;
    public final xtj c;
    public final vvd d;
    public final r94 e;
    public volatile boolean g;
    public long i;
    public a35 j;
    public kyh k;
    public boolean l;
    public final /* synthetic */ vvd m;
    public final s8 f = new s8();
    public boolean h = true;

    public svd(vvd vvdVar, Uri uri, u25 u25Var, xtj xtjVar, vvd vvdVar2, r94 r94Var) {
        this.m = vvdVar;
        this.a = uri;
        this.b = new lkg(u25Var);
        this.c = xtjVar;
        this.d = vvdVar2;
        this.e = r94Var;
        t99.g.getAndIncrement();
        this.j = a(0L, null);
    }

    public final a35 a(long j, String str) {
        Map mapD = vvd.q1;
        if (str != null && !str.startsWith("W/")) {
            hle hleVar = new hle(4);
            hleVar.l(mapD.entrySet());
            hleVar.j("If-Range", str);
            mapD = hleVar.d();
        }
        Map map = Collections.EMPTY_MAP;
        String str2 = this.m.i;
        Uri uri = this.a;
        lvb.W(uri, "The uri must be set.");
        return new a35(uri, 0L, 1, null, mapD, j, -1L, str2, 6, null);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    @Override // defpackage.y99
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void load() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svd.load():void");
    }

    @Override // defpackage.y99
    public final void z() {
        this.g = true;
    }
}
