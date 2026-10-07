package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.webview.FaqWebViewWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qc5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc5(rb8 rb8Var, mh7 mh7Var, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 28;
        this.g = rb8Var;
        this.h = mh7Var;
        this.f = i;
    }

    private final Object l(Object obj) {
        Object value;
        Set<i37> set;
        Object objR;
        Set set2;
        Object next;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        boolean z = false;
        if (i == 0) {
            ch3.d0(obj);
            LinkedHashSet<i37> linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Set setEntrySet = i37.f.entrySet();
            Iterator it = ((Set) this.g).iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Long l = (Long) ((Map.Entry) next).getValue();
                    if (l != null && l.longValue() == jLongValue) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                i37 i37Var = entry != null ? (i37) entry.getKey() : null;
                if (i37Var != null) {
                    linkedHashSet.add(i37Var);
                } else {
                    linkedHashSet2.add(new Long(jLongValue));
                }
            }
            f37 f37Var = (f37) this.h;
            zv8[] zv8VarArr = f37.D;
            if (linkedHashSet.isEmpty() && !f37Var.u.isEmpty()) {
                CopyOnWriteArraySet copyOnWriteArraySet = f37Var.u;
                CopyOnWriteArraySet copyOnWriteArraySet2 = f37Var.v;
                r17 r17Var = f37Var.w;
                if (r17Var != null && (set2 = r17Var.d) != null) {
                    Iterator it3 = set2.iterator();
                    while (it3.hasNext()) {
                        f37Var.H((i37) it3.next(), copyOnWriteArraySet, copyOnWriteArraySet2);
                    }
                }
                f37Var.u.removeIf(new u6(6, new x27(0)));
            } else if (!linkedHashSet.isEmpty()) {
                r17 r17Var2 = f37Var.w;
                f37Var.u.removeIf(new u6(6, new x27(0)));
                f37Var.v.removeIf(new u6(5, new us5(29)));
                pw pwVar = new pw(0);
                for (i37 i37Var2 : linkedHashSet) {
                    pwVar.add(i37Var2);
                    if (r17Var2 == null || r17Var2.d.isEmpty() || !r17Var2.d.contains(i37Var2)) {
                        f37Var.u.add(i37Var2);
                    }
                }
                if (r17Var2 != null && (set = r17Var2.d) != null) {
                    for (i37 i37Var3 : set) {
                        if (!pwVar.contains(i37Var3) && i37.e.contains(i37Var3)) {
                            f37Var.v.add(i37Var3);
                        }
                    }
                }
                if (f37Var.n.getValue() instanceof v27) {
                    mjg mjgVar = f37Var.n;
                    do {
                        value = mjgVar.getValue();
                    } while (!mjgVar.h(value, v27.b((v27) ((w27) value), null, f37Var.N(null), 3)));
                }
            }
            f37 f37Var2 = (f37) this.h;
            this.f = 1;
            if (!linkedHashSet2.isEmpty() || f37Var2.s.isEmpty()) {
                if (linkedHashSet2.isEmpty() || (objR = f37Var2.R(linkedHashSet2, this)) != hu4Var) {
                }
                if (objR != hu4Var) {
                }
            }
            r17 r17Var3 = f37Var2.w;
            if (r17Var3 != null) {
                Iterator it4 = r17Var3.e.iterator();
                while (it4.hasNext()) {
                    f37Var2.I(((Number) it4.next()).longValue());
                }
            }
            f37Var2.s.clear();
            objR = sbiVar;
            if (objR != hu4Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        Iterable iterable = (Iterable) ((f37) this.h).q.a.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it5 = iterable.iterator();
            while (it5.hasNext()) {
                if (((k79) it5.next()).getItemId() == 9223372036854775804L) {
                    z = true;
                    break;
                }
            }
        }
        f37 f37Var3 = (f37) this.h;
        this.f = 2;
        return f37.E(f37Var3, z, this) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8 A[SYNTHETIC] */
    private final Object n(Object obj) {
        Object next;
        EnumSet<jo3> enumSetAllOf;
        Object objV;
        c79 c79VarW;
        int i;
        x67 x67Var = (x67) this.g;
        int i2 = this.f;
        jo3 jo3Var = jo3.a;
        if (i2 == 0) {
            ch3.d0(obj);
            Iterable iterable = (Iterable) x67Var.m.getValue();
            String str = (String) this.h;
            Iterator it = iterable.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cqk.d(((q37) next).a, str));
            q37 q37Var = (q37) next;
            if (q37Var == null || !q37Var.a.equals("all.chat.folder")) {
                enumSetAllOf = EnumSet.allOf(jo3.class);
                if (q37Var == null || q37Var.e.contains(s37.NO_DELETE)) {
                    enumSetAllOf.remove(jo3.b);
                }
                if (q37Var != null && q37Var.d.a == 0) {
                    enumSetAllOf.remove(jo3Var);
                }
            } else {
                xn3 xn3Var = (xn3) x67Var.l.getValue();
                this.f = 1;
                xn3Var.getClass();
                objV = qyj.V(k66.a, new pe3(2, xn3Var), this);
                hu4 hu4Var = hu4.a;
                if (objV == hu4Var) {
                    return hu4Var;
                }
            }
            c79VarW = yab.w();
            for (jo3 jo3Var2 : enumSetAllOf) {
                if (jo3Var2 == null) {
                    i = -1;
                } else {
                    i = s67.$EnumSwitchMapping$0[jo3Var2.ordinal()];
                }
                if (i != 1) {
                    c79VarW.add(new rp4(R.id.chats_list_folder_edit, new tnh(R.string.folder_edit_folder), new Integer(R.drawable.icon_edit), (Integer) null, 20));
                } else if (i != 2) {
                    c79VarW.add(new rp4(R.id.chats_list_folder_delete, new tnh(R.string.folder_delete_folder), new Integer(R.attr.text_negative), new Integer(R.drawable.icon_delete), new Integer(R.attr.icon_negative)));
                } else {
                    if (i == 3) {
                        ore.o();
                        return null;
                    }
                    c79VarW.add(new rp4(R.id.chats_list_folder_read, new tnh(R.string.folder_read_folder), new Integer(R.drawable.icon_status_read), (Integer) null, 20));
                }
            }
            return yab.j(c79VarW);
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        objV = obj;
        enumSetAllOf = ((Number) objV).intValue() > 0 ? EnumSet.of(jo3Var) : EnumSet.noneOf(jo3.class);
        c79VarW = yab.w();
        while (r0.hasNext()) {
            if (jo3Var2 == null) {
                i = -1;
            } else {
                i = s67.$EnumSwitchMapping$0[jo3Var2.ordinal()];
            }
            if (i != 1) {
                c79VarW.add(new rp4(R.id.chats_list_folder_edit, new tnh(R.string.folder_edit_folder), new Integer(R.drawable.icon_edit), (Integer) null, 20));
            } else if (i != 2) {
                c79VarW.add(new rp4(R.id.chats_list_folder_delete, new tnh(R.string.folder_delete_folder), new Integer(R.attr.text_negative), new Integer(R.drawable.icon_delete), new Integer(R.attr.icon_negative)));
            } else {
                if (i == 3) {
                    ore.o();
                    return null;
                }
                c79VarW.add(new rp4(R.id.chats_list_folder_read, new tnh(R.string.folder_read_folder), new Integer(R.drawable.icon_status_read), (Integer) null, 20));
            }
        }
        return yab.j(c79VarW);
    }

    private final Object o(Object obj) throws IOException {
        File file;
        File file2;
        lu7 lu7Var = (lu7) this.h;
        ny8 ny8Var = lu7Var.c;
        ny8 ny8Var2 = lu7Var.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            File file3 = new File(((Context) ny8Var2.getValue()).getCacheDir(), "oneme_heap_dump.hprof");
            if (file3.exists()) {
                file3.delete();
            }
            Debug.dumpHprofData(file3.getAbsolutePath());
            try {
                File fileK = ((ju6) ny8Var.getValue()).k("oneme_heap_dump.hprof");
                lu6.k0(file3, fileK);
                file3.delete();
                file = fileK;
            } catch (Exception unused) {
                file = file3;
            }
            lk9 lk9VarS0 = ((n0c) ((xhh) lu7Var.b.getValue())).c().S0();
            d97 d97Var = new d97(lu7Var, file, file3, null, 6);
            this.g = file;
            this.f = 1;
            Object objK0 = yab.K0(lk9VarS0, d97Var, this);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            file2 = file;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file2 = (File) this.g;
            ch3.d0(obj);
        }
        Context context = (Context) ny8Var2.getValue();
        Uri uriI = ((ju6) ny8Var.getValue()).i(context, file2);
        dp4.c(uriI);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", uriI);
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        intentCreateChooser.addFlags(268435456);
        Iterator<T> it = context.getPackageManager().queryIntentActivities(intentCreateChooser, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriI, 3);
        }
        context.startActivity(intentCreateChooser);
        return sbi.a;
    }

    private final Object p(Object obj) {
        nh7 nh7Var = (nh7) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            rb8 rb8Var = (rb8) this.g;
            mh7 mh7Var = nh7Var.a;
            this.f = 1;
            obj = rb8.c(rb8Var, mh7Var, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return nh7.a(nh7Var, ((Number) obj).intValue(), 13);
    }

    private final Object q(Object obj) {
        ch3.d0(obj);
        rb8 rb8Var = (rb8) this.g;
        ConcurrentHashMap concurrentHashMap = rb8Var.q;
        mh7 mh7Var = (mh7) this.h;
        List list = (List) concurrentHashMap.get(mh7Var);
        sbi sbiVar = sbi.a;
        if (list == null) {
            return sbiVar;
        }
        int i = mh7Var instanceof lh7 ? 40 : this.f;
        if (list.size() <= i) {
            return sbiVar;
        }
        rb8Var.q.put(mh7Var, list.subList(0, i));
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new qc5((rc5) this.g, (pkb) obj2, lq4Var, 0);
            case 1:
                return new qc5((rc5) this.g, (tkb) obj2, lq4Var, 1);
            case 2:
                return new qc5((fg5) this.g, lq4Var, (List) obj2);
            case 3:
                return new qc5((DeviceIdRemoteDataSource) this.g, (Uri) obj2, lq4Var, 3);
            case 4:
                return new qc5((er5) this.g, (File) obj2, lq4Var, 4);
            case 5:
                qc5 qc5Var = new qc5((iz5) obj2, lq4Var, 5);
                qc5Var.g = obj;
                return qc5Var;
            case 6:
                return new qc5((iz5) this.g, (wy5) obj2, lq4Var, 6);
            case 7:
                return new qc5((iz5) this.g, (yy5) obj2, lq4Var, 7);
            case 8:
                return new qc5((p26) this.g, (rb8) obj2, lq4Var, 8);
            case 9:
                return new qc5((cf7) this.g, this.f, (d66) obj2, lq4Var, 9);
            case 10:
                return new qc5((FaqWebViewWidget) obj2, lq4Var, 10);
            case 11:
                qc5 qc5Var2 = new qc5((FaqWebViewWidget) obj2, lq4Var, 11);
                qc5Var2.g = obj;
                return qc5Var2;
            case 12:
                return new qc5((euc) this.g, (ve2) obj2, lq4Var, 12);
            case 13:
                return new qc5((Intent) this.g, this.f, (jq6) obj2, lq4Var, 13);
            case 14:
                qc5 qc5Var3 = new qc5((zt6) obj2, lq4Var, 14);
                qc5Var3.g = obj;
                return qc5Var3;
            case 15:
                return new qc5((njd) this.g, obj2, lq4Var, 15);
            case 16:
                qc5 qc5Var4 = new qc5((b99) obj2, lq4Var, 16);
                qc5Var4.g = obj;
                return qc5Var4;
            case 17:
                return new qc5((a27) this.g, (lc8) obj2, lq4Var, 17);
            case 18:
                return new qc5((c27) this.g, (r17) obj2, lq4Var, 18);
            case 19:
                return new qc5((f37) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new qc5((Set) this.g, (f37) obj2, lq4Var, 20);
            case 21:
                qc5 qc5Var5 = new qc5((k57) obj2, lq4Var, 21);
                qc5Var5.g = obj;
                return qc5Var5;
            case 22:
                return new qc5((x67) this.g, (String) obj2, lq4Var, 22);
            case 23:
                return new qc5((ej7) this.g, (Set) obj2, lq4Var, 23);
            case 24:
                return new qc5((ep7) this.g, (Bundle) obj2, lq4Var, 24);
            case 25:
                return new qc5((lu7) obj2, lq4Var, 25);
            case 26:
                qc5 qc5Var6 = new qc5((ly7) obj2, lq4Var, 26);
                qc5Var6.g = obj;
                return qc5Var6;
            case 27:
                return new qc5((rb8) this.g, (nh7) obj2, lq4Var, 27);
            case 28:
                return new qc5((rb8) this.g, (mh7) obj2, this.f, lq4Var);
            default:
                return new qc5((ne8) this.g, (me8) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((qc5) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((qc5) create((fd4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                ((qc5) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
            case 17:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((qc5) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qc5) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:418:0x094f  */
    /* JADX WARN: Code duplicated, block: B:419:0x0953  */
    /* JADX WARN: Code duplicated, block: B:425:0x096f  */
    /* JADX WARN: Code duplicated, block: B:427:0x0977  */
    /* JADX WARN: Code duplicated, block: B:609:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c0  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0207, code lost:
    
        if (r0 == r5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0916, code lost:
    
        if (r1 == r0) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0941, code lost:
    
        if (r1 == r0) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x09f4, code lost:
    
        if (r0.emit(r2, r18) == r1) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0117, code lost:
    
        if (r1 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
    
        if (r7 == r5) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [r66] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.ArrayList] */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc5(fg5 fg5Var, lq4 lq4Var, List list) {
        super(2, lq4Var);
        this.e = 2;
        this.g = fg5Var;
        this.h = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc5(Object obj, int i, Object obj2, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc5(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc5(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
