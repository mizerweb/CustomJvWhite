package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a26 extends mdh implements wf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ boolean f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a26(dyc dycVar, lq4 lq4Var) {
        super(5, lq4Var);
        this.i = dycVar;
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                a26 a26Var = new a26(5, (lq4) serializable);
                a26Var.g = (f16) obj;
                a26Var.h = (n16) obj2;
                a26Var.i = (omh) obj3;
                a26Var.f = zBooleanValue;
                return a26Var.invokeSuspend(sbiVar);
            default:
                ((Boolean) obj3).getClass();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                a26 a26Var2 = new a26((dyc) this.i, (lq4) serializable);
                a26Var2.g = (wh3) obj;
                a26Var2.h = (List) obj2;
                a26Var2.f = zBooleanValue2;
                return a26Var2.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long[] jArr;
        ylc ylcVar;
        switch (this.e) {
            case 0:
                f16 f16Var = (f16) this.g;
                n16 n16Var = (n16) this.h;
                omh omhVar = (omh) this.i;
                boolean z2 = this.f;
                ch3.d0(obj);
                return Boolean.valueOf(((!(f16Var instanceof e16) && !z2) || (omhVar instanceof nmh) || (n16Var instanceof k16)) ? false : true);
            default:
                wh3 wh3Var = (wh3) this.g;
                List list = (List) this.h;
                boolean z3 = this.f;
                ch3.d0(obj);
                mjg mjgVar = ((dyc) this.i).t;
                Boolean boolValueOf = Boolean.valueOf(wh3Var.b);
                mjgVar.getClass();
                mjgVar.j(null, boolValueOf);
                ArrayList arrayList = new ArrayList(wh3Var.a.size() + (((dyc) this.i).i ? i37.e.size() : 0));
                if (((dyc) this.i).i) {
                    for (i37 i37Var : i37.e) {
                        Object obj2 = i37.f.get(i37Var);
                        if (obj2 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        long jLongValue = ((Number) obj2).longValue();
                        switch (i37Var.ordinal()) {
                            case 0:
                            case 1:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case 12:
                            case 13:
                                ylcVar = new ylc(null, null);
                                break;
                            case 2:
                                ylcVar = new ylc(Integer.valueOf(R.drawable.icon_megaphone), Integer.valueOf(R.string.folder_filter_channels));
                                break;
                            case 3:
                                ylcVar = new ylc(Integer.valueOf(R.drawable.icon_users), Integer.valueOf(R.string.folder_filter_type_chats));
                                break;
                            case 8:
                                ylcVar = new ylc(Integer.valueOf(R.drawable.icon_user), Integer.valueOf(R.string.folder_filter_contacts));
                                break;
                            case 9:
                                ylcVar = new ylc(Integer.valueOf(R.drawable.icon_user_crossed), Integer.valueOf(R.string.folder_filter_not_contacts));
                                break;
                            case 10:
                                ylcVar = new ylc(Integer.valueOf(R.drawable.icon_bot), Integer.valueOf(R.string.folder_filter_bots));
                                break;
                            default:
                                ore.o();
                                return null;
                        }
                        Integer num = (Integer) ylcVar.a;
                        Integer num2 = (Integer) ylcVar.b;
                        if (num2 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        arrayList.add(new qxc(jLongValue, (Long) null, (ynh) new tnh(num2.intValue()), (ynh) null, (Uri) null, false, false, new xyc(6, 6, jLongValue), (CharSequence) "", num, true, 1024));
                    }
                }
                if (!((Boolean) ((dyc) this.i).g.invoke()).booleanValue() || wh3Var.b) {
                    List list2 = wh3Var.a;
                    dyc dycVar = (dyc) this.i;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        qxc qxcVarB = dyc.B(dycVar, (w73) it.next());
                        if (qxcVarB != null) {
                            arrayList.add(qxcVarB);
                        }
                    }
                } else {
                    m8b m8bVar = ui9.a;
                    m8b m8bVar2 = new m8b();
                    pu6 pu6Var = new pu6(yhf.s0(new sw(1, wh3Var.a), new pyb(17)));
                    while (pu6Var.hasNext()) {
                        m8bVar2.a(((Number) pu6Var.next()).longValue());
                    }
                    m8b m8bVar3 = ((dyc) this.i).z;
                    long[] jArr2 = m8bVar3.b;
                    long[] jArr3 = m8bVar3.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr3[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                int i3 = 0;
                                while (true) {
                                    if (i3 < i2) {
                                        z = (j & 255) < 128 && !m8bVar2.d(jArr2[(i << 3) + i3]);
                                        j >>= 8;
                                        i3++;
                                        jArr3 = jArr3;
                                    } else {
                                        jArr = jArr3;
                                        if (i2 == 8) {
                                        }
                                    }
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i != length) {
                                i++;
                                jArr3 = jArr;
                            }
                        }
                    }
                    ((dyc) this.i).z = m8bVar2;
                    if (z) {
                        mjg mjgVar2 = ((dyc) this.i).x;
                        mjgVar2.j(null, Long.valueOf(((Number) mjgVar2.getValue()).longValue() + 1));
                    } else {
                        Iterable iterable = (Iterable) ((dyc) this.i).y.getValue();
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it2 = iterable.iterator();
                            while (it2.hasNext()) {
                                if (m8bVar2.d(((qxc) it2.next()).a)) {
                                    mjg mjgVar3 = ((dyc) this.i).x;
                                    mjgVar3.j(null, Long.valueOf(((Number) mjgVar3.getValue()).longValue() + 1));
                                }
                            }
                        }
                    }
                    List list3 = wh3Var.a;
                    dyc dycVar2 = (dyc) this.i;
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        qxc qxcVarB2 = dyc.B(dycVar2, (w73) it3.next());
                        if (qxcVarB2 != null) {
                            arrayList.add(qxcVarB2);
                        }
                    }
                    cx3.Z0(list, arrayList);
                }
                return new ylc(arrayList, Boolean.valueOf(z3));
        }
    }

    public /* synthetic */ a26(int i, lq4 lq4Var) {
        super(i, lq4Var);
    }
}
