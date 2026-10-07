package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qkh implements Iterable {
    public final ArrayList a = new ArrayList();
    public final ar b;

    public qkh(ar arVar) {
        this.b = arVar;
    }

    public static qkh b(ar arVar) {
        return new qkh(arVar);
    }

    public final void a(ar arVar) {
        Intent intentT = p90.t(arVar);
        if (intentT == null) {
            intentT = p90.t(arVar);
        }
        if (intentT != null) {
            ComponentName component = intentT.getComponent();
            ar arVar2 = this.b;
            if (component == null) {
                component = intentT.resolveActivity(arVar2.getPackageManager());
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            try {
                for (Intent intentU = p90.u(arVar2, component); intentU != null; intentU = p90.u(arVar2, intentU.getComponent())) {
                    arrayList.add(size, intentU);
                }
                arrayList.add(intentT);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            ore.k("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
