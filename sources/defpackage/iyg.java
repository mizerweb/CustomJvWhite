package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iyg {
    public static final String[] a = {"_id", "lookup"};
    public static final String[] b = {"contact_id", "mimetype", "data2", "data3", "data5", "_id", "data1", "display_name", "photo_uri"};

    /* JADX WARN: Code duplicated, block: B:105:0x021b  */
    /* JADX WARN: Code duplicated, block: B:107:0x022f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0237  */
    /* JADX WARN: Code duplicated, block: B:125:0x0295  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x019b A[PHI: r2 r3
  0x019b: PHI (r2v7 vi9) = (r2v2 vi9), (r2v26 vi9) binds: [B:74:0x01b4, B:67:0x0199] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r3v5 android.database.Cursor) = (r3v3 android.database.Cursor), (r3v6 android.database.Cursor) binds: [B:74:0x01b4, B:67:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    public static Collection a(Context context, ed6 ed6Var) {
        Cursor cursor;
        vi9 vi9Var;
        Cursor cursorQuery;
        vi9 vi9Var2;
        int i;
        int i2;
        Set<String> set;
        ytc ytcVar;
        Set<ytc> set2;
        String str;
        String str2;
        int i3;
        String str3;
        String str4 = "/photo";
        String str5 = "vnd.android.cursor.item/name";
        String str6 = "vnd.android.cursor.item/phone_v2";
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return Collections.EMPTY_LIST;
        }
        vi9 vi9Var3 = new vi9((Object) null);
        vi9 vi9Var4 = new vi9((Object) null);
        try {
            cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, b, "mimetype IN (?, ?)", new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name"}, "display_name ASC");
            if (cursorQuery != null) {
                try {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("mimetype");
                        int columnIndex3 = cursorQuery.getColumnIndex("contact_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("display_name");
                        int columnIndex5 = cursorQuery.getColumnIndex("data1");
                        int columnIndex6 = cursorQuery.getColumnIndex("photo_uri");
                        int columnIndex7 = cursorQuery.getColumnIndex("data2");
                        int columnIndex8 = cursorQuery.getColumnIndex("data3");
                        int columnIndex9 = cursorQuery.getColumnIndex("data5");
                        while (cursorQuery.moveToNext()) {
                            vi9 vi9Var5 = vi9Var4;
                            try {
                                long j = cursorQuery.getLong(columnIndex3);
                                int i4 = columnIndex9;
                                String string = cursorQuery.getString(columnIndex2);
                                if (str6.equals(string)) {
                                    ytc ytcVar2 = new ytc();
                                    str2 = str6;
                                    ytcVar2.d = cursorQuery.getInt(columnIndex3);
                                    String string2 = cursorQuery.getString(columnIndex5);
                                    if (ch3.r(string2)) {
                                        vi9Var4 = vi9Var5;
                                        columnIndex9 = i4;
                                        str6 = str2;
                                    } else {
                                        i3 = columnIndex2;
                                        Set setJ = (Set) vi9Var3.b(j);
                                        if (setJ == null) {
                                            setJ = lvb.J(string2);
                                        } else {
                                            setJ.add(string2);
                                        }
                                        vi9Var3.f(j, setJ);
                                        ytcVar2.e = cursorQuery.getLong(columnIndex);
                                        String string3 = cursorQuery.getString(columnIndex4);
                                        if (ytcVar2.a == null) {
                                            ytcVar2.a = string3;
                                        }
                                        String string4 = cursorQuery.getString(columnIndex6);
                                        if (!ch3.r(string4) && string4.endsWith(str4)) {
                                            string4 = string4.replace(str4, "");
                                        }
                                        ytcVar2.c = string4;
                                        long j2 = ytcVar2.d;
                                        vi9Var = vi9Var5;
                                        try {
                                            Set set3 = (Set) vi9Var.b(j2);
                                            if (set3 != null) {
                                                set3.add(ytcVar2);
                                            } else {
                                                HashSet hashSet = new HashSet();
                                                hashSet.add(ytcVar2);
                                                vi9Var.f(j2, hashSet);
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            ((t1c) ed6Var).a(new IllegalStateException("loadPhonebook failed", e));
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            vi9Var2 = new vi9((Object) null);
                                            for (i = 0; i < vi9Var.i(); i++) {
                                                long jE = vi9Var.e(i);
                                                set2 = (Set) vi9Var.b(jE);
                                                if (set2 == null) {
                                                }
                                            }
                                            HashMap map = new HashMap();
                                            for (i2 = 0; i2 < vi9Var3.i(); i2++) {
                                                long jE2 = vi9Var3.e(i2);
                                                set = (Set) vi9Var3.j(i2);
                                                ytcVar = (ytc) vi9Var2.b(jE2);
                                                if (ytcVar == null) {
                                                    gm0.W("iyg", "contact is null", new Object[0]);
                                                } else if (set != null) {
                                                    gm0.W("iyg", "phones is null or empty", new Object[0]);
                                                } else {
                                                    gm0.W("iyg", "phones is null or empty", new Object[0]);
                                                }
                                            }
                                            return map.values();
                                        }
                                    }
                                } else {
                                    str2 = str6;
                                    i3 = columnIndex2;
                                    vi9Var = vi9Var5;
                                    if (str5.equals(string)) {
                                        ytc ytcVar3 = new ytc();
                                        ytcVar3.d = cursorQuery.getInt(columnIndex3);
                                        String string5 = cursorQuery.getString(columnIndex7);
                                        String string6 = cursorQuery.getString(columnIndex8);
                                        str3 = str4;
                                        columnIndex9 = i4;
                                        String string7 = cursorQuery.getString(columnIndex9);
                                        if (ch3.r(string5)) {
                                            if (ch3.s(string6)) {
                                                ytcVar3.a = string6;
                                            }
                                            str5 = str5;
                                        } else {
                                            if (ch3.s(string7)) {
                                                ytcVar3.a = string5 + " " + string7;
                                            } else {
                                                ytcVar3.a = string5;
                                            }
                                            if (ch3.s(string6)) {
                                                ytcVar3.b = string6;
                                            }
                                        }
                                        long j3 = ytcVar3.d;
                                        Set set4 = (Set) vi9Var.b(j3);
                                        if (set4 != null) {
                                            set4.add(ytcVar3);
                                        } else {
                                            HashSet hashSet2 = new HashSet();
                                            hashSet2.add(ytcVar3);
                                            vi9Var.f(j3, hashSet2);
                                        }
                                    }
                                    vi9Var4 = vi9Var;
                                    str4 = str3;
                                    str5 = str5;
                                    str6 = str2;
                                    columnIndex2 = i3;
                                }
                                str3 = str4;
                                columnIndex9 = i4;
                                str5 = str5;
                                vi9Var4 = vi9Var;
                                str4 = str3;
                                str5 = str5;
                                str6 = str2;
                                columnIndex2 = i3;
                            } catch (Exception e2) {
                                e = e2;
                                vi9Var = vi9Var5;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    vi9Var = vi9Var4;
                }
            }
            vi9Var = vi9Var4;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e4) {
            e = e4;
            vi9Var = vi9Var4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        vi9Var2 = new vi9((Object) null);
        while (i < vi9Var.i()) {
            long jE3 = vi9Var.e(i);
            set2 = (Set) vi9Var.b(jE3);
            if (set2 == null && !set2.isEmpty()) {
                ytc ytcVar4 = null;
                for (ytc ytcVar5 : set2) {
                    if (ytcVar4 != null) {
                        String str7 = ytcVar5.b;
                        if (str7 != null && ytcVar4.b == null && (str = ytcVar4.a) != null && str.contains(str7)) {
                            ytcVar4.a = ytcVar5.a;
                            ytcVar4.b = ytcVar5.b;
                            break;
                        }
                    } else {
                        ytcVar4 = ytcVar5;
                    }
                }
                if (ytcVar4 != null) {
                    vi9Var2.f(jE3, ytcVar4);
                }
            }
        }
        HashMap map2 = new HashMap();
        while (i2 < vi9Var3.i()) {
            long jE4 = vi9Var3.e(i2);
            set = (Set) vi9Var3.j(i2);
            ytcVar = (ytc) vi9Var2.b(jE4);
            if (ytcVar == null) {
                gm0.W("iyg", "contact is null", new Object[0]);
            } else if (set != null || set.isEmpty()) {
                gm0.W("iyg", "phones is null or empty", new Object[0]);
            } else {
                for (String str8 : set) {
                    qtc qtcVar = new qtc();
                    qtcVar.c = ytcVar.d;
                    qtcVar.d = str8;
                    qtcVar.g = ch3.r(ytcVar.a) ? str8 : ytcVar.a;
                    qtcVar.h = ytcVar.b;
                    qtcVar.b = ytcVar.e;
                    qtcVar.j = 0;
                    qtcVar.i = ytcVar.c;
                    qtc qtcVar2 = (qtc) map2.get(str8);
                    if (qtcVar2 == null) {
                        map2.put(str8, qtcVar);
                    } else if (qtcVar.b().compareTo(qtcVar2.b()) < 0) {
                        map2.put(str8, qtcVar);
                    }
                }
            }
        }
        return map2.values();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String b(ContentResolver contentResolver, Uri uri, ed6 ed6Var) throws Throwable {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            try {
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    gm0.q("iyg", "getVCardStringFromUri: failed to get file descriptor");
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        try {
                            assetFileDescriptorOpenAssetFileDescriptor.close();
                        } catch (Exception unused) {
                        }
                        return null;
                    }
                    return null;
                }
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                try {
                    String strG = oxl.g(fileInputStreamCreateInputStream);
                    oxl.d(fileInputStreamCreateInputStream);
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (Exception unused2) {
                    }
                    return strG;
                } catch (Exception e) {
                    fileInputStream = fileInputStreamCreateInputStream;
                    e = e;
                    try {
                        ((t1c) ed6Var).a(new IllegalStateException("getVCardStringFromUri failed", e));
                        oxl.d(fileInputStream);
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            try {
                                assetFileDescriptorOpenAssetFileDescriptor.close();
                            } catch (Exception unused3) {
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        oxl.d(fileInputStream2);
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            try {
                                assetFileDescriptorOpenAssetFileDescriptor.close();
                            } catch (Exception unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    fileInputStream2 = fileInputStreamCreateInputStream;
                    th = th2;
                    oxl.d(fileInputStream2);
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            assetFileDescriptorOpenAssetFileDescriptor = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            assetFileDescriptorOpenAssetFileDescriptor = null;
        }
    }

    public static SparseArray c(Context context, List list, ed6 ed6Var) {
        SparseArray sparseArray = new SparseArray(list.size());
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            gm0.q("iyg", "getVCardsByPhoneContactIds failed: contentResolver is null");
            return sparseArray;
        }
        Cursor cursor = null;
        try {
            try {
                String strJoin = TextUtils.join(",", list);
                Cursor cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, a, "_id IN (" + strJoin + ")", null, null);
                if (cursorQuery == null) {
                    gm0.q("iyg", "getVCardsByPhoneContactIds failed: cursor is null");
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                        return sparseArray;
                    }
                } else {
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("lookup");
                    while (cursorQuery.moveToNext()) {
                        int i = cursorQuery.getInt(columnIndex);
                        String string = cursorQuery.getString(columnIndex2);
                        if (ch3.r(string)) {
                            gm0.q("iyg", "getVCardsByPhoneContactIds failed: lookupKey is empty or null");
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                                return sparseArray;
                            }
                        } else {
                            String strB = b(contentResolver, Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, string), ed6Var);
                            if (!ch3.r(strB)) {
                                sparseArray.put(i, strB);
                            }
                        }
                    }
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                        return sparseArray;
                    }
                }
            } catch (Exception e) {
                ((t1c) ed6Var).a(new IllegalStateException("getVCardsByPhoneContactIds failed", e));
                if (0 != 0 && !cursor.isClosed()) {
                    cursor.close();
                }
            }
            return sparseArray;
        } catch (Throwable th) {
            if (0 == 0 || cursor.isClosed()) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:201:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static jyg d(fka fkaVar) {
        int iU;
        String strX;
        Object obj = null;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        Byte bO = null;
        cy8 cy8VarC = null;
        ys3 ys3VarB = null;
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(null, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != 3575610) {
                        if (iHashCode != 1491024380) {
                            if (iHashCode == 1871919611 && strX.equals("coordinates")) {
                                try {
                                    cy8VarC = vm9.c(fkaVar);
                                } catch (Throwable th5) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                    Iterator it3 = fjf.a.iterator();
                                    while (it3.hasNext()) {
                                        AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th5);
                                            accountInitializer3.d().i().g().a(null, th5);
                                        } catch (Throwable th6) {
                                            gm0.V("Payload", "failed to collect exception", th6);
                                        }
                                    }
                                    int iD3 = qt4.D(pye.a);
                                    if (iD3 != 0) {
                                        if (iD3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th5;
                                    }
                                    cy8VarC = null;
                                }
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th7) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                    Iterator it4 = fjf.a.iterator();
                                    while (it4.hasNext()) {
                                        AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th7);
                                            accountInitializer4.d().i().g().a(null, th7);
                                        } catch (Throwable th8) {
                                            gm0.V("Payload", "failed to collect exception", th8);
                                        }
                                    }
                                    int iD4 = qt4.D(pye.a);
                                    if (iD4 != 0) {
                                        if (iD4 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th7;
                                    }
                                }
                            }
                        } else if (strX.equals("clickableLink")) {
                            try {
                                ys3VarB = xs3.b(fkaVar);
                            } catch (Throwable th9) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                Iterator it5 = fjf.a.iterator();
                                while (it5.hasNext()) {
                                    AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th9);
                                        accountInitializer5.d().i().g().a(null, th9);
                                    } catch (Throwable th10) {
                                        gm0.V("Payload", "failed to collect exception", th10);
                                    }
                                }
                                int iD5 = qt4.D(pye.a);
                                if (iD5 != 0) {
                                    if (iD5 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th9;
                                }
                                ys3VarB = null;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("type")) {
                        try {
                            bO = ch3.O(fkaVar);
                        } catch (Throwable th11) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                            Iterator it6 = fjf.a.iterator();
                            while (it6.hasNext()) {
                                AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th11);
                                    accountInitializer6.d().i().g().a(null, th11);
                                } catch (Throwable th12) {
                                    gm0.V("Payload", "failed to collect exception", th12);
                                }
                            }
                            int iD6 = qt4.D(pye.a);
                            if (iD6 != 0) {
                                if (iD6 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th11;
                            }
                            bO = null;
                        }
                    } else {
                        fkaVar.x();
                    }
                } catch (Throwable th13) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                        Iterator it7 = fjf.a.iterator();
                        while (it7.hasNext()) {
                            AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th13);
                                accountInitializer7.d().i().g().a(null, th13);
                            } catch (Throwable th14) {
                                gm0.V("Payload", "failed to collect exception", th14);
                            }
                        }
                        int iD7 = qt4.D(pye.a);
                        if (iD7 != 0) {
                            if (iD7 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th13;
                        }
                    } catch (Throwable th15) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                        Iterator it8 = fjf.a.iterator();
                        while (it8.hasNext()) {
                            AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th15);
                                accountInitializer8.d().i().g().a(null, th15);
                            } catch (Throwable th16) {
                                gm0.V("Payload", "failed to collect exception", th16);
                            }
                        }
                        int iD8 = qt4.D(pye.a);
                        if (iD8 != 0) {
                            if (iD8 == 1) {
                                throw th15;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (cy8VarC == null) {
            String name = iyg.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Coordinates in StoryLayer cannot be null", null);
                }
            }
            return null;
        }
        for (Object obj2 : syg.d) {
            syg sygVar = (syg) obj2;
            if (bO != null && sygVar.a == bO.byteValue()) {
                obj = obj2;
                break;
            }
        }
        syg sygVar2 = (syg) obj;
        if (sygVar2 == null) {
            sygVar2 = syg.UNKNOWN;
        }
        return new jyg(sygVar2, cy8VarC, ys3VarB);
    }

    public static jb9 e(String str) {
        Object next;
        y1 y1Var = new y1(0, sya.m);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (!((sya) next).a.equalsIgnoreCase(str));
        sya syaVar = (sya) next;
        if (syaVar == null) {
            syaVar = sya.UNKNOWN;
        }
        switch (syaVar.ordinal()) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
                return jb9.b;
            case 3:
            default:
                return jb9.a;
            case 4:
                return jb9.c;
            case 9:
            case 10:
                return jb9.d;
        }
    }

    public static int f(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }
}
