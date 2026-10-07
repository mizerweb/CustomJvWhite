package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qyf {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public qyf(px8 px8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    public static ArrayList b(List list, int i, String str, g4b g4bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            flf flfVar = null;
            if (uri.toString().length() > 0) {
                w6g w6gVar = new w6g(i, uri.toString());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(w6gVar);
                flf flfVar2 = new flf(0L, arrayList2);
                flfVar2.k = true;
                flfVar2.g = g4bVar;
                flfVar2.i = str;
                flfVar2.j = null;
                flfVar = flfVar2;
            } else {
                String name = qyf.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4c.f(a4cVar, je9.g, name, "Failed to send media, uri is empty or null", null, null, 8);
                }
            }
            if (flfVar != null) {
                arrayList.add(flfVar);
            }
        }
        return arrayList;
    }

    public final List a(List list, int i, g4b g4bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            w6g w6gVar = null;
            if (!it.hasNext()) {
                break;
            }
            Uri uri = (Uri) it.next();
            if (uri.toString().length() > 0) {
                w6gVar = new w6g(i, uri.toString());
            } else {
                gm0.Y(qyf.class.getName(), "Failed to send media, uri is empty or null");
            }
            if (w6gVar != null) {
                arrayList.add(w6gVar);
            }
        }
        if (arrayList.isEmpty()) {
            gm0.Y(qyf.class.getName(), "Failed to send media, empty medias");
            ((h4b) this.e.getValue()).B(f4b.EMPTY_SHARE_COLLAGE_DATA, g4bVar);
            return r66.a;
        }
        int iIntValue = ((Number) ((e5d) this.f.getValue()).N.a(e5d.S6[32]).i()).intValue();
        ArrayList arrayListY1 = ww3.Y1(arrayList, iIntValue, iIntValue);
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayListY1, 10));
        int i2 = 0;
        for (Object obj : arrayListY1) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                xw3.V0();
                throw null;
            }
            flf flfVar = new flf(0L, (List) obj);
            flfVar.k = true;
            flfVar.g = g4bVar;
            flfVar.i = null;
            flfVar.j = null;
            arrayList2.add(flfVar);
            i2 = i3;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x015b  */
    /* JADX WARN: Code duplicated, block: B:50:0x016b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0170  */
    /* JADX WARN: Code duplicated, block: B:53:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015b -> B:48:0x0167). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(ru.ok.tamtam.android.util.share.ShareData r23, java.util.List r24, java.lang.String r25, java.util.List r26, defpackage.g4b r27, defpackage.nq4 r28) {
        /*
            Method dump skipped, instruction units count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyf.c(ru.ok.tamtam.android.util.share.ShareData, java.util.List, java.lang.String, java.util.List, g4b, nq4):java.lang.Object");
    }
}
