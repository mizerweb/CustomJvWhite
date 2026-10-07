package defpackage;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ma4 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((la4) obj3).invoke(obj, obj2);
                break;
            case 1:
                ((la4) obj3).invoke(obj, obj2);
                break;
            case 2:
                ((m20) obj3).invoke(obj, obj2);
                break;
            case 3:
                ((uv2) obj3).invoke(obj, obj2);
                break;
            case 4:
                HashMap map = (HashMap) obj3;
                String str = (String) obj;
                ml4 ml4Var = (ml4) obj2;
                if (!ch3.r(str) && ml4Var != null) {
                    ul9 ul9Var = new ul9();
                    ul9Var.put("firstName", ml4Var.a);
                    String str2 = ml4Var.b;
                    if (str2 != null && str2.length() != 0) {
                        ul9Var.put("lastName", str2);
                    }
                    map.put(str, ul9Var.b());
                    break;
                }
                break;
            case 5:
                ((z7k) obj3).e(((Integer) obj).intValue(), (String) obj2, 1);
                break;
            default:
                mak makVar = (mak) obj3;
                Integer num = (Integer) obj;
                ebk ebkVar = (ebk) obj2;
                if (!((Long) makVar.h.get(num)).equals(makVar.g.get(num))) {
                    num.getClass();
                    pak pakVar = ebkVar.a;
                    Objects.toString(pakVar);
                    z7k z7kVar = pakVar.b;
                    int i2 = 3;
                    z7kVar.k(new bbk(ebkVar, i2), 20, ebkVar.E(), new cbk(ebkVar, i2), false);
                }
                break;
        }
    }
}
