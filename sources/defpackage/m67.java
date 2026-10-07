package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m67 extends e9i {
    public final /* synthetic */ int g;

    public /* synthetic */ m67(int i) {
        this.g = i;
    }

    @Override // defpackage.e9i
    public Object Z(Object obj, Object obj2) {
        switch (this.g) {
            case 1:
                return ((k79) obj).n((k79) obj2);
            default:
                return super.Z(obj, obj2);
        }
    }

    @Override // defpackage.e9i
    public final boolean g(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                owb owbVar = (owb) obj;
                owb owbVar2 = (owb) obj2;
                return cqk.d(owbVar.a, owbVar2.a) && owbVar.c == owbVar2.c && cqk.d(owbVar.d, owbVar2.d) && z5h.E0(owbVar.b, owbVar2.b) && cqk.d(owbVar.e, owbVar2.e) && cqk.d(owbVar.f, owbVar2.f) && cqk.d(owbVar.g, owbVar2.g);
            default:
                return ((k79) obj).m((k79) obj2);
        }
    }

    @Override // defpackage.e9i
    public final boolean h(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return cqk.d(((owb) obj).a, ((owb) obj2).a);
            default:
                return ((k79) obj).h((k79) obj2);
        }
    }
}
