package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class whh implements xtc {
    public String a;
    public final String b;
    public final Context c;
    public final ny8 d;
    public final ExecutorService e;
    public final svb f;
    public final wwb g;
    public final n25 h;
    public final zed i;
    public final ed6 j;
    public final n30 k;
    public final i5d l;

    public whh(Context context, ny8 ny8Var, ExecutorService executorService, svb svbVar, wwb wwbVar, n25 n25Var, zed zedVar, ed6 ed6Var, n30 n30Var, i5d i5dVar) {
        this.b = context.getString(R.string.tt_contact_account_type);
        this.c = context;
        this.d = ny8Var;
        this.e = executorService;
        this.f = svbVar;
        this.g = wwbVar;
        this.h = n25Var;
        this.i = zedVar;
        this.j = ed6Var;
        this.k = n30Var;
        this.l = i5dVar;
    }

    public static Uri b(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [whh] */
    @Override // defpackage.xtc
    public final void a(List list) {
        List list2;
        ?? arrayList;
        kn3 kn3Var = new kn3(5);
        if ((list instanceof Collection) && list.isEmpty()) {
            list2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                try {
                    if (kn3Var.test(obj)) {
                        arrayList2.add(Long.valueOf(((rtc) obj).e));
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return;
                }
            }
            list2 = arrayList2;
        }
        List listH = ((bi4) this.d.getValue()).h();
        jz2 jz2Var = new jz2(1, list2);
        ahc ahcVar = new ahc(23);
        List list3 = listH;
        if (list3 == null || ((list3 instanceof Collection) && list3.isEmpty())) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list3) {
                try {
                    if (jz2Var.test(obj2)) {
                        arrayList.add(ahcVar.mo41apply(obj2));
                    }
                } catch (Throwable th2) {
                    qr7.o(th2);
                    return;
                }
            }
        }
        gm0.m("whh", "onPhonebookUpdated: phones=%s, serverPhones=%s, contactIds=%s", Integer.valueOf(list.size()), Integer.valueOf(list2.size()), Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            return;
        }
        f(arrayList);
    }

    public final Uri c() {
        return ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a).appendQueryParameter("account_type", this.b).build();
    }

    public final void d(vg4 vg4Var, String str, String str2, String str3) {
        Context context = this.c;
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(b(ContactsContract.RawContacts.CONTENT_URI)).withValue("account_name", this.a);
        String str4 = this.b;
        arrayList.add(builderWithValue.withValue("account_type", str4).withValue("sync1", Long.valueOf(vg4Var.v())).build());
        arrayList.add(ContentProviderOperation.newInsert(b(ContactsContract.Settings.CONTENT_URI)).withValue("account_name", this.a).withValue("account_type", str4).withValue("ungrouped_visible", 1).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder builderWithValue2 = ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2);
        if (((Boolean) this.l.i()).booleanValue()) {
            builderWithValue2.withValue("data5", null);
        }
        arrayList.add(builderWithValue2.build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str3).withValue("data2", 2).build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", context.getString(R.string.tt_contact_mimetype)).withValue("data1", Long.valueOf(vg4Var.v())).withValue("data2", Long.valueOf(vg4Var.w())).withValue("data3", vg4Var.k()).build());
        try {
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            gm0.l("whh", "Exception when add for contact our mime type", e);
            ((t1c) this.j).a(new IllegalStateException("Exception when add for contact our mime type", e));
        }
    }

    public final void e(Set set) {
        gm0.m("whh", "removeContacts: count=%s", Integer.valueOf(set.size()));
        if (set.isEmpty()) {
            return;
        }
        try {
            gm0.m("whh", "removeContacts: deleted count=%s", Integer.valueOf(this.c.getContentResolver().delete(c(), set.size() == 0 ? null : String.format("%1$s IN (%2$s)", "sync1", ch3.t(set)), null)));
        } catch (Exception e) {
            gm0.l("whh", "removeContacts exception", e);
            ((t1c) this.j).a(e);
        }
    }

    public final void f(Collection collection) {
        gm0.m("whh", "sync: count=%s", Integer.valueOf(collection.size()));
        if (collection.isEmpty()) {
            return;
        }
        this.e.execute(new jm((Object) this, (Object) collection, false, 5));
    }

    /* JADX WARN: Code duplicated, block: B:224:0x0540  */
    /* JADX WARN: Code duplicated, block: B:225:0x0543  */
    /* JADX WARN: Code duplicated, block: B:293:0x069c  */
    /* JADX WARN: Code duplicated, block: B:294:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:326:0x0649 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v39, types: [java.util.ArrayList] */
    public final void g(Collection collection, boolean z) throws Throwable {
        String string;
        ?? arrayList;
        Iterator it;
        Object next;
        ed6 ed6Var;
        zed zedVar;
        Collection collection2;
        ArrayList arrayList2;
        boolean z2;
        whh whhVar;
        Object next2;
        String str;
        ContentProviderOperation.Builder builderWithValue;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        long j2;
        Throwable th;
        boolean z3;
        whh whhVar2 = this;
        svb svbVar = whhVar2.f;
        if (!svbVar.b()) {
            gm0.n("whh", "syncWorker: not authorized, return");
            return;
        }
        if (!((wsc) whhVar2.g.a.getValue()).c(wsc.h)) {
            gm0.n("whh", "syncWorker: no permissions, return");
            return;
        }
        zed zedVar2 = whhVar2.i;
        if (z) {
            xb9 xb9Var = zedVar2.a;
            if (((Boolean) xb9Var.u0.m(xb9Var, xb9.g1[11])).booleanValue()) {
                gm0.n("whh", "syncWorker: full sync already completed, return");
                return;
            }
        }
        if (svbVar.b()) {
            string = svbVar.a().d.d.getString("auth.account.name", null);
        } else {
            gm0.Y(svb.class.getName(), "Early return in getAccountName cuz of !isAuthorized");
            string = null;
        }
        whhVar2.a = string;
        if (ch3.r(string)) {
            gm0.n("whh", "syncWorker: accountName empty, return");
            return;
        }
        whhVar2.k.l.set(true);
        gm0.n("whh", "syncWorker: setSelfWriteInProgress(true)");
        HashMap map = new HashMap();
        ji4 ji4Var = ji4.a;
        ny8 ny8Var = whhVar2.d;
        if (z) {
            for (vg4 vg4Var : ((bi4) ny8Var.getValue()).h()) {
                if (vg4Var != null) {
                    ki4 ki4Var = vg4Var.a.b;
                    if (ki4Var.k == ji4Var && ki4Var.i == null && !vg4Var.I()) {
                        map.put(Long.valueOf(vg4Var.v()), vg4Var);
                    }
                }
            }
        } else {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                vg4 vg4VarF = ((bi4) ny8Var.getValue()).f(((Long) it2.next()).longValue(), false);
                if (vg4VarF != null) {
                    ki4 ki4Var2 = vg4VarF.a.b;
                    if (ki4Var2.k == ji4Var && ki4Var2.i == null && !vg4VarF.I()) {
                        map.put(Long.valueOf(vg4VarF.v()), vg4VarF);
                    }
                }
            }
        }
        Context context = whhVar2.c;
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr = {"sync1", "_id", "contact_id"};
        ArrayList<uhh> arrayList3 = new ArrayList();
        Cursor cursorQuery = contentResolver.query(whhVar2.c(), strArr, (collection == null || collection.size() == 0) ? null : String.format("%1$s IN (%2$s)", "sync1", ch3.t(collection)), null, null);
        if (cursorQuery != null) {
            try {
                gm0.m("whh", "getRawContacts: count=%s", Integer.valueOf(cursorQuery.getCount()));
                int columnIndex = cursorQuery.getColumnIndex("sync1");
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("contact_id");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new uhh(cursorQuery.getLong(columnIndex), cursorQuery.getLong(columnIndex2), cursorQuery.getLong(columnIndex3)));
                }
            } catch (Throwable th2) {
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        Collection collectionValues = map.values();
        ahc ahcVar = new ahc(20);
        kn3 kn3Var = new kn3(4);
        if (collectionValues == null || ((collectionValues instanceof Collection) && collectionValues.isEmpty())) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            Iterator it3 = collectionValues.iterator();
            while (it3.hasNext()) {
                try {
                    Object objMo41apply = ahcVar.mo41apply(it3.next());
                    if (kn3Var.test(objMo41apply)) {
                        arrayList.add(objMo41apply);
                    }
                } catch (Throwable th4) {
                    qr7.o(th4);
                    return;
                }
            }
        }
        HashSet hashSet = new HashSet((Collection) arrayList);
        List<ltc> list = (List) ch3.G(whhVar2.h.d().b().a, true, false, new pyb(14));
        ArrayList arrayList4 = new ArrayList(yw3.W0(list, 10));
        for (ltc ltcVar : list) {
            arrayList4.add(new zlc(ltcVar.a(), Long.valueOf(ltcVar.b())));
        }
        ahc ahcVar2 = new ahc(21);
        ahc ahcVar3 = new ahc(22);
        HashMap map2 = new HashMap(arrayList4.size());
        for (Object obj : arrayList4) {
            try {
                map2.put(ahcVar2.mo41apply(obj), ahcVar3.mo41apply(obj));
            } catch (Throwable th5) {
                qr7.o(th5);
                return;
            }
        }
        ed6 ed6Var2 = whhVar2.j;
        Collection<qtc> collectionA = iyg.a(context, ed6Var2);
        ArrayList<rtc> arrayList5 = new ArrayList();
        for (qtc qtcVar : collectionA) {
            Long l = (Long) map2.get(qtcVar.c());
            if (hashSet.contains(l)) {
                qtcVar.l(l != null ? l.longValue() : 0L);
                arrayList5.add(qtcVar.a());
            }
        }
        Collections.sort(arrayList5, new ps0(25));
        HashMap map3 = new HashMap();
        for (rtc rtcVar : arrayList5) {
            map3.put(Long.valueOf(rtcVar.r()), rtcVar);
        }
        Collection collectionValues2 = map3.values();
        ArrayList arrayList6 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (vg4 vg4Var2 : map.values()) {
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator it4 = collectionValues2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        try {
                            if (((rtc) it4.next()).r() == vg4Var2.w()) {
                                arrayList6.add(vg4Var2);
                            }
                        } catch (Throwable th6) {
                            qr7.o(th6);
                            return;
                        }
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                continue;
            } else {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    try {
                        if (((uhh) it5.next()).a == vg4Var2.v()) {
                            hashSet2.add(Long.valueOf(vg4Var2.v()));
                            break;
                        }
                    } catch (Throwable th7) {
                        qr7.o(th7);
                        return;
                    }
                }
            }
        }
        for (uhh uhhVar : arrayList3) {
            if (!map.containsKey(Long.valueOf(uhhVar.a))) {
                hashSet2.add(Long.valueOf(uhhVar.a));
            }
        }
        whhVar2.e(hashSet2);
        gm0.m("whh", "updateContacts: count=%s", Integer.valueOf(arrayList6.size()));
        Iterator it6 = arrayList6.iterator();
        int i = 0;
        int i2 = 0;
        while (it6.hasNext()) {
            vg4 vg4Var3 = (vg4) it6.next();
            List listL = p90.l(collectionValues2, new jz2(2, vg4Var3));
            if (!listL.isEmpty()) {
                Iterator it7 = arrayList3.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        it = it6;
                        next = null;
                        break;
                    }
                    next = it7.next();
                    try {
                        it = it6;
                        if (((uhh) next).a == vg4Var3.v()) {
                            break;
                        } else {
                            it6 = it;
                        }
                    } catch (Throwable th8) {
                        qr7.o(th8);
                        return;
                    }
                }
                uhh uhhVar2 = (uhh) next;
                if (uhhVar2 != null) {
                    Iterator it8 = listL.iterator();
                    do {
                        if (!it8.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it8.next();
                        try {
                        } catch (Throwable th9) {
                            qr7.o(th9);
                            return;
                        }
                    } while (((rtc) next2).r() != vg4Var3.w());
                    rtc rtcVar2 = (rtc) next2;
                    if (rtcVar2 == null) {
                        gm0.n("whh", "updateContacts: phoneDb for update not found, delete old entry and create it again");
                        whhVar2.e(Collections.singleton(Long.valueOf(vg4Var3.v())));
                        rtc rtcVar3 = (rtc) listL.get(0);
                        whhVar2.d(vg4Var3, rtcVar3.m(), rtcVar3.o(), rtcVar3.p());
                        i++;
                        ed6Var = ed6Var2;
                        zedVar = zedVar2;
                        collection2 = collectionValues2;
                        arrayList2 = arrayList3;
                    } else {
                        long j3 = uhhVar2.b;
                        String strM = rtcVar2.m();
                        String strO = rtcVar2.o();
                        String strP = rtcVar2.p();
                        ed6Var = ed6Var2;
                        i5d i5dVar = whhVar2.l;
                        collection2 = collectionValues2;
                        arrayList2 = arrayList3;
                        int i3 = i;
                        int i4 = i2;
                        String str6 = "mimetype";
                        try {
                            Cursor cursorQuery2 = context.getContentResolver().query(b(ContactsContract.Data.CONTENT_URI), new String[]{"data1", "data2", "data3", "mimetype"}, "raw_contact_id = ?", new String[]{String.valueOf(j3)}, null);
                            if (cursorQuery2 != null) {
                                String string2 = null;
                                String string3 = null;
                                j = 0;
                                j2 = 0;
                                String string4 = null;
                                String string5 = null;
                                while (cursorQuery2.moveToNext()) {
                                    try {
                                        String string6 = cursorQuery2.getString(cursorQuery2.getColumnIndex(str6));
                                        String str7 = str6;
                                        zedVar = zedVar2;
                                        try {
                                            if (ch3.a(string6, context.getString(R.string.tt_contact_mimetype))) {
                                                j = cursorQuery2.getLong(cursorQuery2.getColumnIndex("data1"));
                                                j2 = cursorQuery2.getLong(cursorQuery2.getColumnIndex("data2"));
                                                string4 = cursorQuery2.getString(cursorQuery2.getColumnIndex("data3"));
                                            } else if (ch3.a(string6, "vnd.android.cursor.item/name")) {
                                                string2 = cursorQuery2.getString(cursorQuery2.getColumnIndex("data2"));
                                                string3 = cursorQuery2.getString(cursorQuery2.getColumnIndex("data3"));
                                            } else if (ch3.a(string6, "vnd.android.cursor.item/phone_v2")) {
                                                string5 = cursorQuery2.getString(cursorQuery2.getColumnIndex("data1"));
                                            }
                                            str6 = str7;
                                            zedVar2 = zedVar;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            th = th;
                                            cursorQuery2 = cursorQuery2;
                                            str = strO;
                                            if (cursorQuery2 != null) {
                                                try {
                                                    cursorQuery2.close();
                                                } catch (Throwable th11) {
                                                    th.addSuppressed(th11);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        zedVar = zedVar2;
                                    }
                                }
                                zedVar = zedVar2;
                                str2 = string2;
                                str3 = string3;
                                str4 = string4;
                                str5 = string5;
                            } else {
                                zedVar = zedVar2;
                                str2 = null;
                                str3 = null;
                                str4 = null;
                                str5 = null;
                                j = 0;
                                j2 = 0;
                            }
                            try {
                                if (((Boolean) i5dVar.i()).booleanValue()) {
                                    try {
                                        if (rm4.d(str2, str3, strM, strO)) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        str = strO;
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                        throw th;
                                    }
                                } else if (ch3.a(str2, strM) && ch3.a(str3, strO)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (vg4Var3.v() == j && j2 == vg4Var3.w() && ch3.a(str4, vg4Var3.k()) && z3 && ch3.a(str5, strP)) {
                                    if (cursorQuery2 != 0) {
                                        try {
                                            cursorQuery2.close();
                                        } catch (Exception e) {
                                            e = e;
                                            strM = strM;
                                            vg4Var3 = vg4Var3;
                                            str = strO;
                                            vhh vhhVar = new vhh("47701", "needUpdate: exception", e);
                                            gm0.V("whh", vhhVar.getMessage(), vhhVar);
                                            ContentResolver contentResolver2 = context.getContentResolver();
                                            ArrayList<ContentProviderOperation> arrayList7 = new ArrayList<>();
                                            Uri uri = ContactsContract.Data.CONTENT_URI;
                                            builderWithValue = ContentProviderOperation.newUpdate(b(uri)).withSelection("raw_contact_id = ? AND mimetype = ?", new String[]{String.valueOf(j3), "vnd.android.cursor.item/name"}).withValue("data2", strM).withValue("data3", str);
                                            if (((Boolean) i5dVar.i()).booleanValue()) {
                                                builderWithValue.withValue("data5", null);
                                            }
                                            arrayList7.add(builderWithValue.build());
                                            arrayList7.add(ContentProviderOperation.newUpdate(b(uri)).withSelection("raw_contact_id = ? AND mimetype = ?", new String[]{String.valueOf(j3), "vnd.android.cursor.item/phone_v2"}).withValue("data1", strP).build());
                                            arrayList7.add(ContentProviderOperation.newUpdate(b(uri)).withSelection("raw_contact_id = ? AND mimetype = ?", new String[]{String.valueOf(j3), context.getString(R.string.tt_contact_mimetype)}).withValue("data1", Long.valueOf(vg4Var3.v())).withValue("data2", Long.valueOf(vg4Var3.w())).withValue("data3", vg4Var3.k()).build());
                                            contentResolver2.applyBatch("com.android.contacts", arrayList7);
                                            i2 = i4 + 1;
                                            i = i3;
                                        }
                                    }
                                    i = i3;
                                    i2 = i4;
                                } else {
                                    vg4Var3 = vg4Var3;
                                    try {
                                        try {
                                            try {
                                                Object[] objArr = {Long.valueOf(j3), Boolean.valueOf(vg4Var3.v() != j), Long.valueOf(j), Long.valueOf(vg4Var3.v()), Boolean.valueOf(vg4Var3.w() != j2), Long.valueOf(j2), Long.valueOf(vg4Var3.w()), Boolean.valueOf(!ch3.a(str4, vg4Var3.k())), str4, vg4Var3.k(), Boolean.valueOf(!ch3.a(str2, strM)), str2, strM, Boolean.valueOf(!ch3.a(str3, strO)), str3, strO, Boolean.valueOf(!ch3.a(str5, strP)), str5, strP};
                                                strM = strM;
                                                str = strO;
                                                strP = strP;
                                                try {
                                                    gm0.m("whh", "needUpdate: rawContactId=%s serverId=%s(%s) serverPhone=%s(%s) displayName=%s(%s) givenName=%s(%s) familyName=%s(%s) phonebookPhone=%s(%s)", objArr);
                                                    if (cursorQuery2 != 0) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            vhh vhhVar2 = new vhh("47701", "needUpdate: exception", e);
                                                            gm0.V("whh", vhhVar2.getMessage(), vhhVar2);
                                                        }
                                                    }
                                                    ContentResolver contentResolver3 = context.getContentResolver();
                                                    ArrayList<ContentProviderOperation> arrayList8 = new ArrayList<>();
                                                    Uri uri2 = ContactsContract.Data.CONTENT_URI;
                                                    builderWithValue = ContentProviderOperation.newUpdate(b(uri2)).withSelection("raw_contact_id = ? AND mimetype = ?", new String[]{String.valueOf(j3), "vnd.android.cursor.item/name"}).withValue("data2", strM).withValue("data3", str);
                                                    if (((Boolean) i5dVar.i()).booleanValue()) {
                                                        builderWithValue.withValue("data5", null);
                                                    }
                                                    arrayList8.add(builderWithValue.build());
                                                    arrayList8.add(ContentProviderOperation.newUpdate(b(uri2)).withSelection("raw_contact_id = ? AND mimetype = ?", new String[]{String.valueOf(j3), "vnd.android.cursor.item/phone_v2"}).withValue("data1", strP).build());
                                                    arrayList8.add(ContentProviderOperation.newUpdate(b(uri2)).withSelection("raw_contact_id = ? AND mimetype = ?", new String[]{String.valueOf(j3), context.getString(R.string.tt_contact_mimetype)}).withValue("data1", Long.valueOf(vg4Var3.v())).withValue("data2", Long.valueOf(vg4Var3.w())).withValue("data3", vg4Var3.k()).build());
                                                    try {
                                                        contentResolver3.applyBatch("com.android.contacts", arrayList8);
                                                    } catch (Exception e3) {
                                                        gm0.l("whh", "Exception when update for contact our mime type", e3);
                                                        ((t1c) ed6Var).a(new IllegalStateException("Exception when update for contact our mime type", e3));
                                                    }
                                                    i2 = i4 + 1;
                                                    i = i3;
                                                    z2 = false;
                                                    whhVar = this;
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th = th;
                                                    if (cursorQuery2 != null) {
                                                        cursorQuery2.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                strM = strM;
                                                str = strO;
                                                strP = strP;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            strM = strM;
                                            str = strO;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        str = strO;
                                        th = th;
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th18) {
                                th = th18;
                                vg4Var3 = vg4Var3;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            zedVar = zedVar2;
                        }
                    }
                    z2 = false;
                    whhVar = this;
                } else {
                    ed6Var = ed6Var2;
                    zedVar = zedVar2;
                    collection2 = collectionValues2;
                    arrayList2 = arrayList3;
                    z2 = false;
                    rtc rtcVar4 = (rtc) listL.get(0);
                    whhVar = this;
                    whhVar.d(vg4Var3, rtcVar4.m(), rtcVar4.o(), rtcVar4.p());
                    i++;
                }
                it6 = it;
                whhVar2 = whhVar;
                ed6Var2 = ed6Var;
                collectionValues2 = collection2;
                arrayList3 = arrayList2;
                zedVar2 = zedVar;
            }
        }
        zed zedVar3 = zedVar2;
        gm0.m("whh", "updateContacts: inserted=%s, updated=%s", Integer.valueOf(i), Integer.valueOf(i2));
        if (z) {
            xb9 xb9Var2 = zedVar3.a;
            xb9Var2.u0.B(xb9Var2, xb9.g1[11], Boolean.TRUE);
        }
    }
}
