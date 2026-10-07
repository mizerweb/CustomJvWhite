package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jae {
    public static final /* synthetic */ int a = 0;

    public static bae a(eae eaeVar, long j) {
        bae baeVar = new bae();
        mae maeVar = eaeVar.a;
        baeVar.b = maeVar;
        baeVar.d = eaeVar.b;
        baeVar.c = j;
        int iOrdinal = maeVar.ordinal();
        if (iOrdinal == 1) {
            ye6 ye6Var = new ye6();
            ye6Var.a = ((e56) eaeVar).c;
            baeVar.f = ye6Var;
            return baeVar;
        }
        if (iOrdinal == 2) {
            s8 s8Var = new s8();
            s8Var.a = ((cmg) eaeVar).c;
            baeVar.e = s8Var;
            return baeVar;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return baeVar;
            }
            Locale locale = Locale.ENGLISH;
            qr7.x(eaeVar.a, "Unexpected value: ");
            return null;
        }
        o60 o60Var = ((qm7) eaeVar).c;
        byte[] byteArray = sia.toByteArray(a.o(o60Var));
        gj2 gj2Var = new gj2(5);
        gj2Var.c = byteArray;
        gj2Var.b = o60Var.i;
        baeVar.g = gj2Var;
        return baeVar;
    }

    public static ArrayList b(List list) {
        eae e56Var;
        eae imVar;
        eae cmgVar;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bae baeVar = (bae) it.next();
            int iOrdinal = baeVar.b.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        try {
                            cmgVar = new qm7(a.n(Protos.Attaches.Attach.Photo.parseFrom((byte[]) baeVar.g.c)), baeVar.d);
                        } catch (InvalidProtocolBufferNanoException e) {
                            gm0.V("jae", "Can't parse gif", e);
                            imVar = new im();
                        }
                    } else if (iOrdinal != 4) {
                        Locale locale = Locale.ENGLISH;
                        gm0.q("jae", "Unknown recentDb type " + baeVar.c);
                        imVar = new im();
                    } else {
                        e56Var = new im(baeVar.d);
                    }
                    arrayList.add(imVar);
                } else {
                    cmgVar = new cmg(baeVar.e.a, baeVar.d);
                }
                imVar = cmgVar;
                arrayList.add(imVar);
            } else {
                e56Var = new e56(baeVar.f.a);
            }
            imVar = e56Var;
            arrayList.add(imVar);
        }
        return arrayList;
    }
}
