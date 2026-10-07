package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t2f extends a8j implements f45 {
    public static final String n = s2f.class.getName();
    public final Long c;
    public final xhh d;
    public final mjg e;
    public final r8e f;
    public final ny8 g;
    public final mjg h;
    public final r8e i;
    public final l9b j;
    public List k;
    public final ifh l;
    public final ic6 m;

    public t2f(Long l, xhh xhhVar, ny8 ny8Var) {
        this.c = l;
        this.d = xhhVar;
        mjg mjgVarA = p90.a(null);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        this.g = ny8Var;
        mjg mjgVarA2 = p90.a(null);
        this.h = mjgVarA2;
        this.i = new r8e(mjgVarA2);
        this.j = new l9b();
        this.k = r66.a;
        this.l = new ifh(new ize(3, this));
        yab.i0(this.b, ((n0c) xhhVar).a(), 0, new voc(this, null, 23), 2);
        this.m = new ic6(null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0026 A[EDGE_INSN: B:6:0x0026->B:20:0x007b BREAK  A[LOOP:1: B:9:0x0047->B:19:0x0078]] */
    public static final ArrayList B(t2f t2fVar) {
        int i;
        yk7 yk7Var = (yk7) t2fVar.l.getValue();
        Calendar calendar = Calendar.getInstance();
        Locale locale = Locale.getDefault();
        yk7Var.getClass();
        int i2 = 2;
        int i3 = 1;
        if (calendar.get(2) != 1 || calendar.get(5) != 29) {
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.add(6, 365);
            long timeInMillis = calendar.getTimeInMillis();
            long timeInMillis2 = calendar2.getTimeInMillis();
            int i4 = calendar.get(1);
            int i5 = calendar2.get(1);
            if (i4 > i5) {
                i = 366;
                break;
            }
            while (true) {
                Calendar calendar3 = Calendar.getInstance(calendar.getTimeZone());
                calendar3.clear();
                calendar3.set(1, i4);
                calendar3.set(2, 1);
                calendar3.set(5, 29);
                if (calendar3.get(2) == 1 && calendar3.get(5) == 29) {
                    long timeInMillis3 = calendar3.getTimeInMillis();
                    if (timeInMillis <= timeInMillis3 && timeInMillis3 <= timeInMillis2) {
                        i = 367;
                        break;
                    }
                }
                if (i4 == i5) {
                    i = 366;
                    break;
                }
                i4++;
            }
        } else {
            i = 366;
            break;
        }
        int i6 = calendar.get(1);
        int i7 = calendar.get(5);
        int i8 = calendar.get(2);
        String str = yk7Var.a;
        j45 j45Var = new j45(0L, i7, i8, i6, str, new xnh(str));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, d MMM", locale);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("d MMM YYYY", locale);
        ArrayList arrayList = new ArrayList(i);
        arrayList.add(j45Var);
        int i9 = i - 1;
        int i10 = 0;
        while (i10 < i9) {
            calendar.add(5, i3);
            long size = arrayList.size();
            int i11 = calendar.get(i3) == j45Var.d ? i3 : 0;
            int i12 = size == 1 ? i3 : 0;
            arrayList.add(new j45(size, calendar.get(5), calendar.get(i2), calendar.get(i3), (i11 != 0 ? simpleDateFormat2 : simpleDateFormat3).format(calendar.getTime()), i12 != 0 ? new tnh(R.string.tt_dates_tomorrow) : new xnh((i11 != 0 ? simpleDateFormat : simpleDateFormat3).format(calendar.getTime()))));
            i10++;
            i2 = 2;
            i3 = 1;
        }
        t2fVar.k = arrayList;
        return arrayList;
    }

    public static p2f C(t2f t2fVar, List list, j45 j45Var, int i, int i2) {
        int i3;
        Calendar calendar = Calendar.getInstance();
        Iterator it = list.iterator();
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            j45 j45Var2 = (j45) it.next();
            if (j45Var2.d == j45Var.d && j45Var2.c == j45Var.c && j45Var2.b == j45Var.b) {
                break;
            }
            i4++;
        }
        int i5 = i4 < 0 ? 0 : i4;
        if (i5 == 0) {
            return D(list, i, i2, calendar);
        }
        if (i5 != xw3.O0(list)) {
            ArrayList arrayListB = jvk.b(0);
            ArrayList arrayListC = jvk.c(0);
            return new p2f(list, arrayListB, arrayListC, i5, oc9.v(i, 0, xw3.O0(arrayListB)), oc9.v(i2, 0, xw3.O0(arrayListC)));
        }
        int i6 = calendar.get(11);
        int iV = oc9.v(i, 0, i6);
        List listN1 = ww3.N1(jvk.b(0), i6 + 1);
        Iterator it2 = listN1.iterator();
        int i7 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i7 = -1;
                break;
            }
            if (((zrh) it2.next()).a == iV) {
                break;
            }
            i7++;
        }
        int i8 = i7 < 0 ? 0 : i7;
        int i9 = iV == i6 ? calendar.get(12) : 59;
        int iV2 = oc9.v(i2, 0, i9);
        List listN2 = ww3.N1(jvk.c(0), i9 + 1);
        Iterator it3 = listN2.iterator();
        int i10 = 0;
        while (it3.hasNext()) {
            if (((zrh) it3.next()).a == iV2) {
                i3 = i10;
                break;
            }
            i10++;
        }
        return new p2f(list, listN1, listN2, i5, i8, i3 < 0 ? 0 : i3);
    }

    public static p2f D(List list, int i, int i2, Calendar calendar) {
        int i3;
        Calendar calendar2 = (Calendar) calendar.clone();
        if (calendar2.get(13) > 35) {
            calendar2.add(12, 2);
        } else {
            calendar2.add(12, 1);
        }
        int i4 = calendar2.get(11);
        int iMax = Math.max(oc9.v(i, 0, 23), i4);
        ArrayList arrayListB = jvk.b(i4);
        Iterator it = arrayListB.iterator();
        int i5 = 0;
        while (true) {
            i3 = -1;
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (((zrh) it.next()).a == iMax) {
                break;
            }
            i5++;
        }
        int i6 = i5 < 0 ? 0 : i5;
        int i7 = calendar2.get(12);
        int iV = iMax != i4 ? oc9.v(i2, 0, 59) : Math.max(oc9.v(i2, 0, 59), i7);
        if (iMax != i4) {
            i7 = 0;
        }
        ArrayList arrayListC = jvk.c(i7);
        Iterator it2 = arrayListC.iterator();
        int i8 = 0;
        while (it2.hasNext()) {
            if (((zrh) it2.next()).a == iV) {
                i3 = i8;
                break;
            }
            i8++;
        }
        return new p2f(list, arrayListB, arrayListC, 0, i6, i3 < 0 ? 0 : i3);
    }

    public final void E() {
        x35 x35Var = (x35) this.h.getValue();
        if (x35Var == null) {
            gm0.Y(t2f.class.getName(), "Early return in regenerateScheduledSendPickerData cuz of _dateTime.value is null");
        } else {
            F(C(this, this.k, x35Var.a, x35Var.b.a, x35Var.c.a));
        }
    }

    public final void F(p2f p2fVar) {
        gm0.m(n, "setData %s", p2fVar);
        mjg mjgVar = this.e;
        mjgVar.getClass();
        mjgVar.j(null, p2fVar);
        x35 x35Var = new x35((j45) p2fVar.a.get(p2fVar.d), (zrh) p2fVar.b.get(p2fVar.e), (zrh) p2fVar.c.get(p2fVar.f));
        mjg mjgVar2 = this.h;
        mjgVar2.getClass();
        mjgVar2.j(null, x35Var);
    }
}
