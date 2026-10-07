package defpackage;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mpl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.lang.Integer[]] */
    public static final Bundle a(Collection collection) {
        Bundle bundle = new Bundle((collection.size() * 5) + 1);
        bundle.putInt("size", collection.size());
        int[] iArr = new int[collection.size()];
        ?? r2 = new Integer[collection.size()];
        ?? r3 = new Integer[collection.size()];
        ?? r4 = new Integer[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            rp4 rp4Var = (rp4) obj;
            iArr[i] = rp4Var.a;
            bundle.putParcelable(zo5.h(i, "text_"), rp4Var.b);
            r2[i] = rp4Var.c;
            r3[i] = rp4Var.d;
            r4[i] = rp4Var.e;
            i = i2;
        }
        bundle.putIntArray("ids", iArr);
        bundle.putSerializable("textColors", r2);
        bundle.putSerializable("icons", r3);
        bundle.putSerializable("iconColors", r4);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [poe] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public static final Collection b(Bundle bundle) {
        ?? poeVar;
        try {
            int i = bundle.getInt("size");
            int[] intArray = bundle.getIntArray("ids");
            if (intArray == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Integer[] numArr = (Integer[]) bundle.getSerializable("textColors");
            Integer[] numArr2 = (Integer[]) bundle.getSerializable("icons");
            Integer[] numArr3 = (Integer[]) bundle.getSerializable("iconColors");
            hj8 hj8VarF0 = oc9.f0(0, i);
            poeVar = new ArrayList(yw3.W0(hj8VarF0, 10));
            Iterator it = hj8VarF0.iterator();
            while (((gj8) it).c) {
                int iNextInt = ((gj8) it).nextInt();
                int i2 = intArray[iNextInt];
                Parcelable parcelable = bundle.getParcelable("text_" + iNextInt);
                if (parcelable == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                poeVar.add(new rp4(i2, (ynh) parcelable, numArr[iNextInt], numArr2[iNextInt], numArr3[iNextInt]));
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                thA.printStackTrace();
            }
            boolean z = poeVar instanceof poe;
            ?? r6 = poeVar;
            if (z) {
                r6 = 0;
            }
            Collection collection = (List) r6;
            if (collection == null) {
                collection = r66.a;
            }
            return collection;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
    }

    public static void c(Service service, int i, Notification notification, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            io.l(service, i, notification, i2);
        } else if (i3 >= 29) {
            io.j(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }
}
