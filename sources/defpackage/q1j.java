package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.Region;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q1j {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public q1j(nf2 nf2Var, Size size) {
        Rational rational;
        this.c = nf2Var;
        this.a = nf2Var.d();
        this.b = nf2Var.j();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listQ = nf2Var.q(np0.n);
            if (listQ.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listQ, new x44(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.d = rational;
        sr7 sr7Var = new sr7();
        sr7Var.a = nf2Var.d();
        sr7Var.b = nf2Var.j();
        sr7Var.d = rational;
        sr7Var.c = rational == null || rational.getNumerator() >= rational.getDenominator();
        this.e = sr7Var;
    }

    public static String c(ov6 ov6Var) {
        ov6Var.a();
        yv6 yv6Var = ov6Var.c;
        String str = yv6Var.e;
        if (str != null) {
            return str;
        }
        ov6Var.a();
        String str2 = yv6Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ix.a);
        arrayList2.add(ix.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!ix.a(size, (Rational) it2.next(), mag.c));
            }
        }
        return arrayList2;
    }

    public static Rational g(int i, boolean z) {
        if (i == -1 || i == 0) {
            return z ? ix.a : ix.b;
        }
        if (i == 1) {
            return z ? ix.c : ix.d;
        }
        tvj.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap h(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = e(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (ix.a(size, rational, mag.c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static void k(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void l(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public void a(View view) {
        je9 je9Var = je9.f;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth == this.a && measuredHeight == this.b) {
            return;
        }
        this.a = measuredWidth;
        this.b = measuredHeight;
        if (view.getMeasuredWidth() != view.getMeasuredHeight()) {
            String name = q1j.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, qt4.l("Cannot calculate a video msg clickable area: w=", view.getMeasuredWidth(), view.getMeasuredHeight(), ", h="), null);
                return;
            }
            return;
        }
        float measuredWidth2 = view.getMeasuredWidth() / 2.0f;
        float left = view.getLeft() + measuredWidth2;
        float top = view.getTop() + measuredWidth2;
        try {
            ((Path) this.c).reset();
            ((Path) this.c).addCircle(left, top, measuredWidth2, Path.Direction.CW);
            ((Region) this.d).set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            ((Region) this.e).setPath((Path) this.c, (Region) this.d);
        } catch (Exception e) {
            String name2 = q1j.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                int left2 = view.getLeft();
                int top2 = view.getTop();
                int right = view.getRight();
                int bottom = view.getBottom();
                StringBuilder sbP = qv1.p("calculateClickableArea: EXCEPTION during setPath - view.left=", left2, ", view.top=", top2, ", view.right=");
                qt4.x(right, bottom, ", view.bottom=", ", radius=", sbP);
                c0a.u(sbP, measuredWidth2, ", centerX=", left, ", centerY=");
                sbP.append(top);
                a4cVar2.c(je9Var, name2, sbP.toString(), e);
            }
            throw e;
        }
    }

    public synchronized String b() {
        try {
            if (((String) this.d) == null) {
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    public ArrayList f(cmi cmiVar) {
        Size[] sizeArr;
        Rational rational;
        nf2 nf2Var = (nf2) this.c;
        v68 v68Var = (v68) cmiVar;
        List list = (List) v68Var.b(v68.E0, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null) {
            return arrayList;
        }
        dne dneVar = (dne) v68Var.b(v68.D0, null);
        List list2 = (List) v68Var.b(v68.C0, null);
        int inputFormat = cmiVar.getInputFormat();
        if (list2 == null) {
            sizeArr = null;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == inputFormat) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = nf2Var.q(inputFormat);
        }
        ArrayList arrayList2 = new ArrayList(listAsList);
        Collections.sort(arrayList2, new x44(true));
        if (arrayList2.isEmpty()) {
            tvj.g("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + inputFormat + ".");
        }
        if (dneVar == null) {
            sr7 sr7Var = (sr7) this.e;
            sr7Var.getClass();
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            ArrayList<Size> arrayList3 = new ArrayList(arrayList2);
            Collections.sort(arrayList3, new x44(true));
            ArrayList arrayList4 = new ArrayList();
            v68 v68Var2 = (v68) cmiVar;
            Size size = (Size) v68Var2.b(v68.B0, null);
            Size size2 = (Size) arrayList3.get(0);
            if (size == null) {
                size = size2;
            } else if (mag.a(size2) < size.getHeight() * size.getWidth()) {
                size = size2;
            }
            Size sizeA = sr7Var.a(v68Var2);
            Size size3 = mag.c;
            int iA = mag.a(size3);
            if (mag.a(size) < iA) {
                size3 = mag.a;
            } else if (sizeA != null) {
                if (sizeA.getHeight() * sizeA.getWidth() < iA) {
                    size3 = sizeA;
                }
            }
            for (Size size4 : arrayList3) {
                if (mag.a(size4) <= size.getHeight() * size.getWidth()) {
                    if (size4.getHeight() * size4.getWidth() >= mag.a(size3) && !arrayList4.contains(size4)) {
                        arrayList4.add(size4);
                    }
                }
            }
            if (arrayList4.isEmpty()) {
                throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size3 + "\nmaxSize = " + size + "\ninitial size list: " + arrayList3);
            }
            bh0 bh0Var = v68.v0;
            if (v68Var2.f(bh0Var)) {
                rational = g(((Integer) v68Var2.i(bh0Var)).intValue(), sr7Var.c);
            } else {
                Size sizeA2 = sr7Var.a(v68Var2);
                if (sizeA2 != null) {
                    Iterator it2 = e(arrayList4).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            rational = new Rational(sizeA2.getWidth(), sizeA2.getHeight());
                            break;
                        }
                        Rational rational2 = (Rational) it2.next();
                        if (ix.a(sizeA2, rational2, mag.c)) {
                            rational = rational2;
                            break;
                        }
                    }
                } else {
                    rational = null;
                }
            }
            if (sizeA == null) {
                sizeA = (Size) v68Var2.b(v68.A0, null);
            }
            ArrayList arrayList5 = new ArrayList();
            new HashMap();
            if (rational == null) {
                arrayList5.addAll(arrayList4);
                if (sizeA != null) {
                    k(arrayList5, sizeA, true);
                    return arrayList5;
                }
            } else {
                HashMap mapH = h(arrayList4);
                if (sizeA != null) {
                    Iterator it3 = mapH.keySet().iterator();
                    while (it3.hasNext()) {
                        k((List) mapH.get((Rational) it3.next()), sizeA, true);
                    }
                }
                ArrayList arrayList6 = new ArrayList(mapH.keySet());
                Collections.sort(arrayList6, new hx(rational, (Rational) sr7Var.d));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    for (Size size5 : (List) mapH.get((Rational) it4.next())) {
                        if (!arrayList5.contains(size5)) {
                            arrayList5.add(size5);
                        }
                    }
                }
            }
            return arrayList5;
        }
        Size size6 = (Size) ((v68) cmiVar).b(v68.B0, null);
        int iY = v68Var.y(0);
        if (!((Boolean) cmiVar.b(cmi.f1, Boolean.FALSE)).booleanValue()) {
            cmiVar.getInputFormat();
        }
        tvj.a("SupportedOutputSizesCollector", "useCaseConfig = " + cmiVar + ", candidateSizes = " + arrayList2);
        dne dneVar2 = (dne) v68Var.i(v68.D0);
        Rational rational3 = (Rational) this.d;
        int i = this.a;
        int i2 = this.b;
        ww6 ww6Var = dneVar2.a;
        HashMap mapH2 = h(arrayList2);
        Rational rationalG = g(ww6Var.b, rational3 == null || rational3.getNumerator() >= rational3.getDenominator());
        ArrayList<Rational> arrayList7 = new ArrayList(mapH2.keySet());
        Collections.sort(arrayList7, new hx(rationalG, rational3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational4 : arrayList7) {
            linkedHashMap.put(rational4, (List) mapH2.get(rational4));
        }
        if (size6 != null) {
            Size size7 = mag.a;
            int height = size6.getHeight() * size6.getWidth();
            Iterator it5 = linkedHashMap.keySet().iterator();
            while (it5.hasNext()) {
                List<Size> list3 = (List) linkedHashMap.get((Rational) it5.next());
                ArrayList arrayList8 = new ArrayList();
                for (Size size8 : list3) {
                    if (mag.a(size8) <= height) {
                        arrayList8.add(size8);
                    }
                }
                list3.clear();
                list3.addAll(arrayList8);
            }
        }
        ene eneVar = dneVar2.b;
        if (eneVar != null) {
            Iterator it6 = linkedHashMap.keySet().iterator();
            while (it6.hasNext()) {
                List list4 = (List) linkedHashMap.get((Rational) it6.next());
                if (!list4.isEmpty()) {
                    int i3 = eneVar.b;
                    if (eneVar != ene.c) {
                        Size size9 = eneVar.a;
                        if (i3 == 0) {
                            boolean zContains = list4.contains(size9);
                            list4.clear();
                            if (zContains) {
                                list4.add(size9);
                            }
                        } else if (i3 == 1) {
                            k(list4, size9, true);
                        } else if (i3 == 2) {
                            k(list4, size9, false);
                        } else if (i3 == 3) {
                            l(list4, size9, true);
                        } else if (i3 == 4) {
                            l(list4, size9, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it7 = linkedHashMap.values().iterator();
        while (it7.hasNext()) {
            for (Size size10 : (List) it7.next()) {
                if (!arrayList9.contains(size10)) {
                    arrayList9.add(size10);
                }
            }
        }
        oo6 oo6Var = dneVar2.c;
        if (oo6Var == null) {
            return arrayList9;
        }
        njl.b(njl.c(iY), i, i2 == 1);
        ArrayList arrayList10 = new ArrayList(arrayList9);
        Size size11 = (Size) oo6Var.b;
        ArrayList arrayList11 = new ArrayList(arrayList10);
        if (arrayList11.contains(size11)) {
            arrayList11.remove(size11);
            arrayList11.add(0, size11);
        }
        if (arrayList9.containsAll(arrayList11)) {
            return arrayList11;
        }
        ore.p("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
        return null;
    }

    public boolean i() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.b = 2;
                    } else {
                        this.b = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public synchronized void j() {
        PackageInfo packageInfoD = d(((Context) this.c).getPackageName());
        if (packageInfoD != null) {
            this.d = Integer.toString(packageInfoD.versionCode);
            this.e = packageInfoD.versionName;
        }
    }

    public q1j(Context context) {
        this.b = 0;
        this.c = context;
    }

    public q1j() {
        this.c = new Path();
        this.d = new Region();
        this.e = new Region();
        this.a = -1;
        this.b = -1;
    }
}
