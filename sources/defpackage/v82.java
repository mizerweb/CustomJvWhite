package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v82 implements vd4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ njd b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v82(Object obj, njd njdVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = njdVar;
    }

    private final void b() {
    }

    private final void d() {
    }

    @Override // defpackage.vd4
    public final void a() {
        int i = this.a;
        njd njdVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                njdVar.c(((w82) obj).j.c() ? vmi.a : vmi.b);
                break;
            default:
                njdVar.c(((wd4) ((ny8) obj).getValue()).c() ? fbj.a : fbj.b);
                break;
        }
    }

    @Override // defpackage.vd4
    public final void c() {
        int i = this.a;
    }
}
