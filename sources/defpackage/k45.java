package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k45 extends e9i {
    public static final k45 h = new k45(0);
    public static final k45 i = new k45(1);
    public static final k45 j = new k45(2);
    public final /* synthetic */ int g;

    public /* synthetic */ k45(int i2) {
        this.g = i2;
    }

    @Override // defpackage.e9i
    public final boolean g(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return ((j45) obj).equals((j45) obj2);
            case 1:
                return ((ni7) obj).equals((ni7) obj2);
            case 2:
                return ((jef) obj).equals((jef) obj2);
            case 3:
                return ((qy9) obj).equals((qy9) obj2);
            case 4:
                return ((wm4) obj).equals((wm4) obj2);
            case 5:
                return ((kb9) obj).equals((kb9) obj2);
            case 6:
                return false;
            case 7:
                y8f y8fVar = (y8f) obj;
                y8f y8fVar2 = (y8f) obj2;
                if (new pw(y8fVar.b).equals(new pw(y8fVar2.b))) {
                    return y8fVar.i(y8fVar2);
                }
                return false;
            case 8:
                return ((pkc) obj).m((pkc) obj2);
            default:
                return ((aoh) obj).equals((aoh) obj2);
        }
    }

    @Override // defpackage.e9i
    public final boolean h(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return ((j45) obj).a == ((j45) obj2).a;
            case 1:
                return cqk.d(((ni7) obj).a(), ((ni7) obj2).a());
            case 2:
                return ((jef) obj).a.a == ((jef) obj2).a.a;
            case 3:
                return ((qy9) obj).h((qy9) obj2);
            case 4:
                return ((wm4) obj).a == ((wm4) obj2).a;
            case 5:
                return ((kb9) obj).a == ((kb9) obj2).a;
            case 6:
                return false;
            case 7:
                y8f y8fVar = (y8f) obj;
                y8f y8fVar2 = (y8f) obj2;
                if (y8fVar.a != y8fVar2.a) {
                    return false;
                }
                return y8fVar.o(y8fVar2);
            case 8:
                return ((pkc) obj).h((pkc) obj2);
            default:
                return cqk.d(((aoh) obj).getName(), ((aoh) obj2).getName());
        }
    }
}
