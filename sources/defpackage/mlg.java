package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mlg extends sq0 {
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final long l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;

    public mlg(llg llgVar) {
        super(llgVar.a);
        this.b = llgVar.b;
        this.c = llgVar.c;
        this.d = llgVar.d;
        this.e = llgVar.e;
        this.f = llgVar.f;
        this.g = llgVar.g;
        this.h = llgVar.h;
        this.i = llgVar.i;
        this.j = llgVar.j;
        this.k = llgVar.k;
        this.l = llgVar.l;
        this.m = llgVar.m;
        this.n = llgVar.n;
        this.o = llgVar.o;
        this.p = llgVar.p;
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerDb{stickerId=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", url='");
        sb.append(this.e);
        sb.append("', updateTime=");
        sb.append(this.f);
        sb.append(", mp4url='");
        sb.append(this.g);
        sb.append("', firstUrl='");
        sb.append(this.h);
        sb.append("', previewUrl='");
        sb.append(this.i);
        sb.append("', tags='");
        sb.append(this.j);
        sb.append("', token='null', stickerType=");
        sb.append(c0a.B(this.k));
        sb.append(", setId=");
        sb.append(this.l);
        sb.append(", lottieUrl='");
        sb.append(this.m);
        sb.append("', audio=");
        sb.append(this.n);
        sb.append(", authorType=");
        sb.append(c0a.A(this.o));
        sb.append(", videoUrl='");
        return zo5.w(sb, this.p, "'}");
    }
}
