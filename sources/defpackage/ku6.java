package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import one.me.android.initialization.AccountInitializer;
import one.me.android.utils.MultiaccountFeature$ToggleService;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class ku6 implements fu3, yd6, m74, cg5, xhe, c4b {
    public static edc n;
    public final /* synthetic */ int a;
    public static final ku6 b = new ku6(0);
    public static final ku6 c = new ku6(1);
    public static final ku6 d = new ku6(2);
    public static final ku6 e = new ku6(3);
    public static final ku6 f = new ku6(4);
    public static final ku6 g = new ku6(5);
    public static final ku6 h = new ku6(6);
    public static final ku6 i = new ku6(7);
    public static final ku6 j = new ku6(8);
    public static final ku6 k = new ku6(9);
    public static final ku6 l = new ku6(10);
    public static final ku6 m = new ku6(11);
    public static final ku6 o = new ku6(12);
    public static final ku6 p = new ku6(13);

    public /* synthetic */ ku6(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x024c A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #3 {all -> 0x00a5, blocks: (B:157:0x023d, B:158:0x0246, B:160:0x024c, B:164:0x0268, B:165:0x026c, B:169:0x0277, B:170:0x027c, B:171:0x027d, B:27:0x0066, B:28:0x006f, B:30:0x0075, B:34:0x0091, B:35:0x0095, B:38:0x009f, B:39:0x00a4, B:42:0x00a9, B:23:0x005f, B:161:0x0254, B:31:0x007d), top: B:197:0x023d, inners: #2, #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0277 A[Catch: all -> 0x00a5, TryCatch #3 {all -> 0x00a5, blocks: (B:157:0x023d, B:158:0x0246, B:160:0x024c, B:164:0x0268, B:165:0x026c, B:169:0x0277, B:170:0x027c, B:171:0x027d, B:27:0x0066, B:28:0x006f, B:30:0x0075, B:34:0x0091, B:35:0x0095, B:38:0x009f, B:39:0x00a4, B:42:0x00a9, B:23:0x005f, B:161:0x0254, B:31:0x007d), top: B:197:0x023d, inners: #2, #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x027d A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #3 {all -> 0x00a5, blocks: (B:157:0x023d, B:158:0x0246, B:160:0x024c, B:164:0x0268, B:165:0x026c, B:169:0x0277, B:170:0x027c, B:171:0x027d, B:27:0x0066, B:28:0x006f, B:30:0x0075, B:34:0x0091, B:35:0x0095, B:38:0x009f, B:39:0x00a4, B:42:0x00a9, B:23:0x005f, B:161:0x0254, B:31:0x007d), top: B:197:0x023d, inners: #2, #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0280 A[SYNTHETIC] */
    private final kih A(fka fkaVar) {
        int iU;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        int iJ;
        u8b u8bVar = cqb.b;
        int i2 = 1;
        int i3 = 0;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th2) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = fjf.a.iterator();
            while (it2.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it2.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th2);
                    accountInitializer.d().i().g().a(null, th2);
                } catch (Throwable th3) {
                    gm0.V("Payload", "failed to collect exception", th3);
                }
            }
            int iD2 = qt4.D(pye.a);
            if (iD2 != 0) {
                if (iD2 == 1) {
                    throw th2;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        int i4 = 0;
        int iR = 0;
        long jT = -1;
        while (i4 < iU) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th4) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it3 = fjf.a.iterator();
                while (it3.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th4);
                        accountInitializer2.d().i().g().a(null, th4);
                    } catch (Throwable th5) {
                        gm0.V("Payload", "failed to collect exception", th5);
                    }
                }
                int iD3 = qt4.D(pye.a);
                if (iD3 != 0) {
                    if (iD3 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th4;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1081306054) {
                        if (iHashCode != -810660181) {
                            if (iHashCode == 180244549) {
                                try {
                                    if (strX.equals("voteCount")) {
                                        try {
                                            iR = ch3.R(fkaVar, i3);
                                        } catch (Throwable th6) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                            Iterator it4 = fjf.a.iterator();
                                            while (it4.hasNext()) {
                                                AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th6);
                                                    accountInitializer3.d().i().g().a(null, th6);
                                                } catch (Throwable th7) {
                                                    gm0.V("Payload", "failed to collect exception", th7);
                                                }
                                            }
                                            int iD4 = qt4.D(pye.a);
                                            if (iD4 != 0) {
                                                if (iD4 != i2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th6;
                                            }
                                            iR = i3;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    try {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                        it = fjf.a.iterator();
                                        while (it.hasNext()) {
                                            AccountInitializer accountInitializer4 = ((n6) it.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th);
                                                accountInitializer4.d().i().g().a(null, th);
                                            } catch (Throwable th9) {
                                                gm0.V("Payload", "failed to collect exception", th9);
                                            }
                                        }
                                        iD = qt4.D(pye.a);
                                        if (iD != 0) {
                                            if (iD != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th;
                                        }
                                        i4++;
                                        i2 = 1;
                                        i3 = 0;
                                    } catch (Throwable th10) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                        Iterator it5 = fjf.a.iterator();
                                        while (it5.hasNext()) {
                                            AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th10);
                                                accountInitializer5.d().i().g().a(null, th10);
                                            } catch (Throwable th11) {
                                                gm0.V("Payload", "failed to collect exception", th11);
                                            }
                                        }
                                        int iD5 = qt4.D(pye.a);
                                        if (iD5 != 0) {
                                            if (iD5 == 1) {
                                                throw th10;
                                            }
                                            ore.o();
                                            return null;
                                        }
                                    }
                                }
                            }
                        } else if (strX.equals("voters")) {
                            u8b u8bVar2 = cqb.b;
                            try {
                                if (fkaVar.y().a() == 7) {
                                    try {
                                        iJ = ch3.J(fkaVar);
                                    } catch (Throwable th12) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                        Iterator it6 = fjf.a.iterator();
                                        while (it6.hasNext()) {
                                            AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th12);
                                                accountInitializer6.d().i().g().a(null, th12);
                                            } catch (Throwable th13) {
                                                gm0.V("Payload", "failed to collect exception", th13);
                                            }
                                        }
                                        int iD6 = qt4.D(pye.a);
                                        if (iD6 != 0) {
                                            if (iD6 != i2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th12;
                                        }
                                        iJ = i3;
                                    }
                                    u8b u8bVar3 = new u8b(iJ);
                                    while (i3 < iJ) {
                                        b6d b6dVarB = ejl.b(fkaVar);
                                        if (b6dVarB != null) {
                                            u8bVar3.b(b6dVarB);
                                        }
                                        i3++;
                                    }
                                    u8bVar2 = u8bVar3;
                                } else {
                                    fkaVar.x();
                                }
                            } catch (Throwable th14) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th14);
                                        accountInitializer7.d().i().g().a(null, th14);
                                    } catch (Throwable th15) {
                                        gm0.V("Payload", "failed to collect exception", th15);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                if (iD7 != 0) {
                                    if (iD7 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th14;
                                }
                                u8bVar = u8bVar2;
                                i4++;
                                i2 = 1;
                                i3 = 0;
                            }
                            u8bVar = u8bVar2;
                        }
                    } else if (strX.equals("marker")) {
                        try {
                            jT = ch3.T(fkaVar, -1L);
                        } catch (Throwable th16) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                                Iterator it8 = fjf.a.iterator();
                                while (it8.hasNext()) {
                                    AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th16);
                                        accountInitializer8.d().i().g().a(null, th16);
                                    } catch (Throwable th17) {
                                        gm0.V("Payload", "failed to collect exception", th17);
                                    }
                                }
                                int iD8 = qt4.D(pye.a);
                                if (iD8 != 0) {
                                    if (iD8 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th16;
                                }
                                jT = -1;
                            } catch (Throwable th18) {
                                th = th18;
                                th = th;
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                it = fjf.a.iterator();
                                while (it.hasNext()) {
                                    AccountInitializer accountInitializer9 = ((n6) it.next()).a;
                                    gm0.V("Payload", "error while parse payload", th);
                                    accountInitializer9.d().i().g().a(null, th);
                                }
                                iD = qt4.D(pye.a);
                                if (iD != 0) {
                                    if (iD != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable th19) {
                    th = th19;
                }
            }
            i4++;
            i2 = 1;
            i3 = 0;
        }
        return new ead(jT, u8bVar, iR);
    }

    public static void B(String str) {
        Object poeVar;
        Object poeVar2;
        try {
            File file = new File(str);
            try {
                poeVar2 = Boolean.valueOf(file.exists() ? file.delete() : false);
            } catch (Throwable th) {
                poeVar2 = new poe(th);
            }
            Object obj = Boolean.FALSE;
            if (poeVar2 instanceof poe) {
                poeVar2 = obj;
            }
            poeVar = (Boolean) poeVar2;
        } catch (Throwable th2) {
            poeVar = new poe(th2);
        }
        Object obj2 = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = obj2;
        }
    }

    public static void C(Widget widget, kzi kziVar) {
        Integer numL;
        CharSequence charSequenceB = kziVar.v().b(widget.getContext());
        if (charSequenceB == null) {
            return;
        }
        ynh ynhVarR = kziVar.r();
        CharSequence charSequenceB2 = ynhVarR != null ? ynhVarR.b(widget.getContext()) : null;
        h8c h8cVar = new h8c(widget);
        h8cVar.n(charSequenceB);
        h8cVar.b(charSequenceB2);
        View view = widget.getView();
        h8cVar.c(new o8c(1, (view == null || (numL = n7j.l(view)) == null) ? 0 : numL.intValue(), 0, 12));
        h8cVar.p();
    }

    public static final void e(File... fileArr) {
        for (File file : fileArr) {
            if (file.exists()) {
                try {
                    sb8.o(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }
    }

    public static final long j(long j2, Long l2) {
        if (l2 != null) {
            return j2 - l2.longValue();
        }
        return -1L;
    }

    public static final zv l(File[] fileArr, int i2) {
        List listSingletonList;
        zv zvVar = new zv();
        int i3 = 0;
        for (File file : fileArr) {
            if (file.exists()) {
                try {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(lu6.n0(file));
                    c79 c79VarW = yab.w();
                    while (byteBufferWrap.hasRemaining()) {
                        try {
                            c79VarW.add(ch3.E(byteBufferWrap));
                        } catch (BufferUnderflowException unused) {
                        } catch (Exception e2) {
                            byteBufferWrap.position();
                            file.toString();
                            c79VarW.add(m(e2));
                        }
                    }
                    if (c79VarW.getSize() > 1) {
                        bx3.Y0(c79VarW, new xa8(4));
                    }
                    listSingletonList = yab.j(c79VarW);
                } catch (Exception e3) {
                    file.toString();
                    listSingletonList = Collections.singletonList(m(e3));
                }
            } else {
                listSingletonList = r66.a;
            }
            if (!listSingletonList.isEmpty()) {
                if (zvVar.isEmpty() || ((be9) zvVar.last()).a < ((be9) ww3.r1(listSingletonList)).a) {
                    zvVar.addAll(listSingletonList);
                } else {
                    int i4 = zvVar.c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (((be9) zvVar.get(i5)).a > ((be9) ww3.B1(listSingletonList)).a) {
                            zvVar.addAll(i5, listSingletonList);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it = zvVar.iterator();
        while (it.hasNext()) {
            i3 += ((be9) it.next()).c;
        }
        while (i3 > i2) {
            i3 -= ((be9) zvVar.removeFirst()).c;
        }
        return zvVar;
    }

    public static be9 m(Exception exc) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Cannot read file: ");
        sb.append(exc.getClass().getName());
        String message = exc.getMessage();
        if (message != null && message.length() != 0) {
            sb.append(": ");
            sb.append(message);
        }
        byte[] bytes = sb.toString().getBytes(pt2.a);
        SimpleDateFormat simpleDateFormat = de9.a;
        int i2 = Integer.MAX_VALUE;
        if (bytes.length > Integer.MAX_VALUE) {
            if ((bytes[2147483647] & 192) == 128) {
                do {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                } while ((bytes[i2] & 192) == 128);
            }
            bytes = a.T0(0, bytes, i2);
        }
        return new be9(jCurrentTimeMillis, bytes);
    }

    public static boolean o(File file) {
        Object poeVar;
        try {
            poeVar = Boolean.valueOf(file.exists() && file.canRead());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object obj = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = obj;
        }
        return ((Boolean) poeVar).booleanValue();
    }

    public static boolean p(String str) {
        Object poeVar;
        try {
            poeVar = Boolean.valueOf(o(new File(str)));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object obj = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = obj;
        }
        return ((Boolean) poeVar).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001f A[RETURN] */
    public static mg5 q(ku6 ku6Var, Number number) {
        mg5 mg5Var = mg5.REGULAR;
        ku6Var.getClass();
        byte bByteValue = number.byteValue();
        for (mg5 mg5Var2 : mg5.values()) {
            if (mg5Var2.a == bByteValue) {
                if (mg5Var2 == null) {
                    return mg5Var;
                }
                return mg5Var2;
            }
        }
        mg5Var2 = null;
        if (mg5Var2 == null) {
            return mg5Var;
        }
        return mg5Var2;
    }

    public static File t(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (file2.exists()) {
            int iY0 = r5h.Y0(str, '.', 0, 6);
            int i2 = 0;
            while (i2 < 100) {
                if (iY0 != -1) {
                    str2 = str.substring(0, iY0) + "(" + (i2 + 1) + ")" + str.substring(iY0);
                } else {
                    str2 = str + "(" + (i2 + 1) + ")";
                }
                File file3 = new File(file, str2);
                if (!file3.exists()) {
                    return file3;
                }
                i2++;
                file2 = file3;
            }
        }
        return file2;
    }

    public static jeg v(CharSequence charSequence) {
        SpannableString spannableString;
        try {
            spannableString = new SpannableString(charSequence);
            tre.K(spannableString);
        } catch (IndexOutOfBoundsException unused) {
            if (charSequence instanceof Spannable) {
                tre.K((Spannable) charSequence);
            }
            spannableString = new SpannableString(charSequence);
        }
        return new jeg(spannableString);
    }

    public static boolean w(String str, String str2, ArrayList arrayList) {
        if (str2 == null) {
            String strU1 = r5h.u1(31, str);
            int length = strU1.length();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (z5h.K0(str3, strU1, false) && str3.length() > length && str3.charAt(length) == '=') {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
        String strU2 = r5h.u1(31, str);
        int length2 = strU2.length();
        String strU3 = r5h.u1(31, str2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            if (z5h.K0(str4, strU2, false) && str4.length() > length2 && str4.charAt(length2) == '=') {
                it2.remove();
                if (!str4.endsWith(strU3) || str4.length() != strU3.length() + length2 + 1) {
                    break;
                    break;
                }
                arrayList.add(str4);
                return false;
            }
        }
        arrayList.add(strU2 + "=" + strU3);
        while (arrayList.size() > 30) {
            arrayList.remove(0);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final kih x(fka fkaVar) {
        int iU;
        String strX;
        boolean zL;
        if (!fkaVar.l()) {
            return null;
        }
        int i2 = 1;
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
        Boolean boolValueOf = null;
        long jT = -1;
        int i3 = 0;
        int iR = 0;
        while (i3 < iU) {
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
                    if (iD2 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1867169789) {
                        if (iHashCode != -840272977) {
                            if (iHashCode == 3344077 && strX.equals("mark")) {
                                try {
                                    jT = ch3.T(fkaVar, -1L);
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
                                    jT = -1;
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
                        } else if (strX.equals("unread")) {
                            try {
                                iR = ch3.R(fkaVar, 0);
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
                                iR = 0;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("success")) {
                        try {
                            zL = ch3.L(fkaVar);
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
                            zL = false;
                        }
                        boolValueOf = Boolean.valueOf(zL);
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
                        i3++;
                        i2 = 1;
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
            i3++;
            i2 = 1;
        }
        return new l13(jT, iR, boolValueOf);
    }

    private final kih y(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
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
        u8b u8bVar = null;
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (strX.equals("folders")) {
                        u8b u8bVar2 = cqb.b;
                        try {
                            if (fkaVar.y().a() == 7) {
                                try {
                                    iJ = ch3.J(fkaVar);
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
                                    iJ = 0;
                                }
                                u8b u8bVar3 = new u8b(iJ);
                                for (int i3 = 0; i3 < iJ; i3++) {
                                    vy2 vy2VarI = qyj.I(fkaVar);
                                    if (vy2VarI != null) {
                                        u8bVar3.b(vy2VarI);
                                    }
                                }
                                u8bVar2 = u8bVar3;
                            } else {
                                fkaVar.x();
                            }
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
                        u8bVar = u8bVar2;
                    } else {
                        try {
                            fkaVar.x();
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
                        }
                    }
                } catch (Throwable th11) {
                    try {
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
                    } catch (Throwable th13) {
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
                            if (iD7 == 1) {
                                throw th13;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (u8bVar != null) {
            return new c57(u8bVar);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:187:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final kih z(fka fkaVar) {
        int iU;
        String strX;
        long jT;
        Byte bO;
        gm0.n("NotifMsgDelayedCmd", "response");
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
        if (iU == 0) {
            return null;
        }
        int iA = 5;
        long[] jArrC = null;
        gda gdaVarQ0 = null;
        Long lValueOf = null;
        long jT2 = 0;
        long jT3 = 0;
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (iD2 == 1) {
                        throw th3;
                    }
                    ore.o();
                    return null;
                }
                strX = null;
            }
            if (strX != null) {
                switch (strX.hashCode()) {
                    case -1690743503:
                        if (strX.equals("messageIds")) {
                            jArrC = fjf.c(fkaVar);
                        } else {
                            try {
                                fkaVar.x();
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
                                    if (iD3 == 1) {
                                        throw th5;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                        break;
                    case -1361631597:
                        if (!strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                            fkaVar.x();
                        } else {
                            try {
                                jT2 = ch3.T(fkaVar, 0L);
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
                                    if (iD4 == 1) {
                                        throw th7;
                                    }
                                    ore.o();
                                    return null;
                                }
                                jT2 = 0;
                            }
                        }
                        break;
                    case -951297470:
                        if (strX.equals("lastDelayedUpdateTime")) {
                            try {
                                jT = ch3.T(fkaVar, 0L);
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
                                    if (iD5 == 1) {
                                        throw th9;
                                    }
                                    ore.o();
                                    return null;
                                }
                                jT = 0;
                            }
                            lValueOf = Long.valueOf(jT);
                        } else {
                            fkaVar.x();
                        }
                        break;
                    case -907060194:
                        if (strX.equals("updateTypeId")) {
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
                                    if (iD6 == 1) {
                                        throw th11;
                                    }
                                    ore.o();
                                    return null;
                                }
                                bO = null;
                            }
                            iA = wcl.a(bO);
                        } else {
                            fkaVar.x();
                        }
                        break;
                    case -836030906:
                        if (!strX.equals("userId")) {
                            fkaVar.x();
                        } else {
                            try {
                                jT3 = ch3.T(fkaVar, 0L);
                            } catch (Throwable th13) {
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
                                    if (iD7 == 1) {
                                        throw th13;
                                    }
                                    ore.o();
                                    return null;
                                }
                                jT3 = 0;
                            }
                        }
                        break;
                    case 954925063:
                        if (strX.equals("message")) {
                            gdaVarQ0 = yab.q0(fkaVar);
                        } else {
                            fkaVar.x();
                        }
                        break;
                    default:
                        fkaVar.x();
                        break;
                }
            }
        }
        if (jArrC == null) {
            jArrC = yl2.a;
        }
        return new dkb(jT2, jT3, iA, gdaVarQ0, jArrC, lValueOf);
    }

    @Override // defpackage.cg5
    public boolean a(SSLSocket sSLSocket) {
        return z5h.K0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.yd6
    public long b() {
        if (Build.VERSION.SDK_INT >= 35) {
            ghb ghbVar = ew5.b;
            return qe7.P(SystemClock.uptimeNanos(), lw5.NANOSECONDS);
        }
        ghb ghbVar2 = ew5.b;
        return qe7.P(SystemClock.uptimeMillis(), lw5.MILLISECONDS);
    }

    @Override // defpackage.m74
    public ComponentName c() {
        return new ComponentName("ru.oneme.app", MultiaccountFeature$ToggleService.class.getName());
    }

    @Override // defpackage.cg5
    public scg d(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                ahc.f(cls, "No OpenSSLSocketImpl superclass of socket of type ");
                return null;
            }
        }
        return new uh(superclass);
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        return Integer.valueOf(ch3.R(fkaVar, 0));
    }

    /* JADX WARN: Code duplicated, block: B:475:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x05d8 A[EXC_TOP_SPLITTER, PHI: r18
  0x05d8: PHI (r18v13 ??) = (r18v19 ??), (r18v20 ??), (r18v21 ??), (r18v14 ??) binds: [B:391:0x05d6, B:367:0x057c, B:343:0x0521, B:307:0x04ab] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [kih] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.fu3
    public kih i(fka fkaVar) {
        int iU;
        String str;
        String strX;
        boolean z;
        int iU2;
        String strX2;
        int iU3;
        String strX3;
        int i2 = this.a;
        r66 r66Var = r66.a;
        int i3 = 1;
        int i4 = 0;
        String str2 = null;
        switch (i2) {
            case 1:
                if (fkaVar.l()) {
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
                    Object objI1 = null;
                    String strX4 = null;
                    String strX5 = null;
                    String strX6 = null;
                    ?? r2 = iU;
                    ?? r18 = this;
                    while (i4 < r2) {
                        try {
                            strX = ch3.X(fkaVar, str2);
                        } catch (Throwable th3) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                            Iterator it2 = fjf.a.iterator();
                            while (it2.hasNext()) {
                                AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th3);
                                    accountInitializer2.d().i().g().a(str2, th3);
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
                                switch (strX.hashCode()) {
                                    case -464731655:
                                        r18 = r2 == true ? 1 : 0;
                                        r18 = r18;
                                        if (!strX.equals("failoverHosts")) {
                                            try {
                                                fkaVar.x();
                                            } catch (Throwable th5) {
                                                try {
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
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    Throwable th8 = th;
                                                    try {
                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                                        Iterator it4 = fjf.a.iterator();
                                                        while (it4.hasNext()) {
                                                            AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                                            try {
                                                                gm0.V("Payload", "error while parse payload", th8);
                                                                accountInitializer4.d().i().g().a(null, th8);
                                                            } catch (Throwable th9) {
                                                                gm0.V("Payload", "failed to collect exception", th9);
                                                            }
                                                        }
                                                        int iD4 = qt4.D(pye.a);
                                                        if (iD4 != 0) {
                                                            if (iD4 != 1) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            throw th8;
                                                        }
                                                    } catch (Throwable th10) {
                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                                        Iterator it5 = fjf.a.iterator();
                                                        while (it5.hasNext()) {
                                                            AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                                            try {
                                                                gm0.V("Payload", "error while parse payload", th10);
                                                                try {
                                                                    accountInitializer5.d().i().g().a(null, th10);
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    gm0.V("Payload", "failed to collect exception", th);
                                                                }
                                                            } catch (Throwable th12) {
                                                                th = th12;
                                                            }
                                                        }
                                                        str = null;
                                                        int iD5 = qt4.D(pye.a);
                                                        if (iD5 != 0) {
                                                            if (iD5 == 1) {
                                                                throw th10;
                                                            }
                                                            ore.o();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            List listA = fjf.a(fkaVar, r66Var, i9.d);
                                            if (!listA.isEmpty()) {
                                                h4e h4eVar = i4e.a;
                                                objI1 = ww3.I1(listA);
                                            }
                                        }
                                        break;
                                    case 106458:
                                        r18 = r2 == true ? 1 : 0;
                                        r18 = r18;
                                        if (!strX.equals("m4a")) {
                                            fkaVar.x();
                                        } else {
                                            try {
                                                strX5 = ch3.X(fkaVar, null);
                                            } catch (Throwable th13) {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                                Iterator it6 = fjf.a.iterator();
                                                while (it6.hasNext()) {
                                                    AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th13);
                                                        accountInitializer6.d().i().g().a(null, th13);
                                                    } catch (Throwable th14) {
                                                        gm0.V("Payload", "failed to collect exception", th14);
                                                    }
                                                }
                                                int iD6 = qt4.D(pye.a);
                                                if (iD6 != 0) {
                                                    if (iD6 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th13;
                                                }
                                                strX5 = null;
                                            }
                                        }
                                        break;
                                    case 108272:
                                        r18 = r2 == true ? 1 : 0;
                                        r18 = r18;
                                        if (!strX.equals("mp3")) {
                                            fkaVar.x();
                                        } else {
                                            try {
                                                strX6 = ch3.X(fkaVar, null);
                                            } catch (Throwable th15) {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                                Iterator it7 = fjf.a.iterator();
                                                while (it7.hasNext()) {
                                                    AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th15);
                                                        accountInitializer7.d().i().g().a(null, th15);
                                                    } catch (Throwable th16) {
                                                        gm0.V("Payload", "failed to collect exception", th16);
                                                    }
                                                }
                                                int iD7 = qt4.D(pye.a);
                                                if (iD7 != 0) {
                                                    if (iD7 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th15;
                                                }
                                                strX6 = null;
                                            }
                                        }
                                        break;
                                    case 3418175:
                                        if (strX.equals("opus")) {
                                            try {
                                                strX4 = ch3.X(fkaVar, null);
                                                r18 = r2 == true ? 1 : 0;
                                            } catch (Throwable th17) {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                                Iterator it8 = fjf.a.iterator();
                                                r2 = r2;
                                                while (it8.hasNext()) {
                                                    AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th17);
                                                        iv4 iv4VarG = accountInitializer8.d().i().g();
                                                        z = r2 == true ? 1 : 0;
                                                        try {
                                                            iv4VarG.a(null, th17);
                                                        } catch (Throwable th18) {
                                                            th = th18;
                                                            gm0.V("Payload", "failed to collect exception", th);
                                                            r2 = z;
                                                        }
                                                    } catch (Throwable th19) {
                                                        th = th19;
                                                        z = r2 == true ? 1 : 0;
                                                    }
                                                    r2 = z;
                                                }
                                                r18 = r2 == true ? 1 : 0;
                                                int iD8 = qt4.D(pye.a);
                                                if (iD8 != 0) {
                                                    if (iD8 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th17;
                                                }
                                                strX4 = null;
                                            }
                                            break;
                                        }
                                    default:
                                        r18 = r2 == true ? 1 : 0;
                                        fkaVar.x();
                                        break;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                r18 = r2;
                            }
                        } else {
                            r18 = r2 == true ? 1 : 0;
                        }
                        i4++;
                        r2 = r18;
                        str2 = null;
                        r18 = r18;
                        break;
                    }
                    str = str2;
                    if (strX4 != null || strX5 != null || strX6 != null) {
                        return new xa0(strX4, strX5, strX6, (String) objI1);
                    }
                } else {
                    str = null;
                }
                return str;
            case 2:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU2 = ch3.U(fkaVar);
                } catch (Throwable th21) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                    Iterator it9 = fjf.a.iterator();
                    while (it9.hasNext()) {
                        AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th21);
                            accountInitializer9.d().i().g().a(null, th21);
                        } catch (Throwable th22) {
                            gm0.V("Payload", "failed to collect exception", th22);
                        }
                    }
                    int iD9 = qt4.D(pye.a);
                    if (iD9 != 0) {
                        if (iD9 == 1) {
                            throw th21;
                        }
                        ore.o();
                        return null;
                    }
                    iU2 = 0;
                }
                if (iU2 == 0) {
                    return null;
                }
                List listA2 = r66Var;
                pj4 pj4VarE = null;
                dig digVarB = null;
                while (i4 < iU2) {
                    try {
                        strX2 = ch3.X(fkaVar, null);
                    } catch (Throwable th23) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                        Iterator it10 = fjf.a.iterator();
                        while (it10.hasNext()) {
                            AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th23);
                                accountInitializer10.d().i().g().a(null, th23);
                            } catch (Throwable th24) {
                                gm0.V("Payload", "failed to collect exception", th24);
                            }
                        }
                        int iD10 = qt4.D(pye.a);
                        if (iD10 != 0) {
                            if (iD10 == i3) {
                                throw th23;
                            }
                            ore.o();
                            return null;
                        }
                        strX2 = null;
                    }
                    if (strX2 != null) {
                        int iHashCode = strX2.hashCode();
                        if (iHashCode != -602535288) {
                            if (iHashCode != 820478277) {
                                if (iHashCode == 951526432 && strX2.equals("contact")) {
                                    try {
                                        pj4VarE = pj4.e(fkaVar);
                                    } catch (Throwable th25) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                        Iterator it11 = fjf.a.iterator();
                                        while (it11.hasNext()) {
                                            AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th25);
                                                accountInitializer11.d().i().g().a(null, th25);
                                            } catch (Throwable th26) {
                                                gm0.V("Payload", "failed to collect exception", th26);
                                            }
                                        }
                                        int iD11 = qt4.D(pye.a);
                                        if (iD11 != 0) {
                                            if (iD11 == 1) {
                                                throw th25;
                                            }
                                            ore.o();
                                            return null;
                                        }
                                        pj4VarE = null;
                                    }
                                } else {
                                    try {
                                        fkaVar.x();
                                    } catch (Throwable th27) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th27);
                                        Iterator it12 = fjf.a.iterator();
                                        while (it12.hasNext()) {
                                            AccountInitializer accountInitializer12 = ((n6) it12.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th27);
                                                accountInitializer12.d().i().g().a(null, th27);
                                            } catch (Throwable th28) {
                                                gm0.V("Payload", "failed to collect exception", th28);
                                            }
                                        }
                                        int iD12 = qt4.D(pye.a);
                                        if (iD12 != 0) {
                                            if (iD12 == 1) {
                                                throw th27;
                                            }
                                            ore.o();
                                            return null;
                                        }
                                    }
                                }
                            } else if (strX2.equals("startMessage")) {
                                try {
                                    digVarB = hrl.b(fkaVar);
                                } catch (Throwable th29) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th29);
                                    Iterator it13 = fjf.a.iterator();
                                    while (it13.hasNext()) {
                                        AccountInitializer accountInitializer13 = ((n6) it13.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th29);
                                            accountInitializer13.d().i().g().a(null, th29);
                                        } catch (Throwable th30) {
                                            gm0.V("Payload", "failed to collect exception", th30);
                                        }
                                    }
                                    int iD13 = qt4.D(pye.a);
                                    if (iD13 != 0) {
                                        if (iD13 == 1) {
                                            throw th29;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    digVarB = null;
                                }
                            } else {
                                fkaVar.x();
                            }
                        } else if (strX2.equals("commands")) {
                            try {
                                listA2 = d01.a(fkaVar);
                            } catch (Throwable th31) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th31);
                                Iterator it14 = fjf.a.iterator();
                                while (it14.hasNext()) {
                                    AccountInitializer accountInitializer14 = ((n6) it14.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th31);
                                        accountInitializer14.d().i().g().a(null, th31);
                                    } catch (Throwable th32) {
                                        gm0.V("Payload", "failed to collect exception", th32);
                                    }
                                }
                                int iD14 = qt4.D(pye.a);
                                if (iD14 != 0) {
                                    if (iD14 == 1) {
                                        throw th31;
                                    }
                                    ore.o();
                                    return null;
                                }
                                listA2 = r66Var;
                            }
                        } else {
                            fkaVar.x();
                        }
                    }
                    i4++;
                    i3 = 1;
                    break;
                }
                return new q01(listA2, pj4VarE, digVarB);
            case 3:
                return x(fkaVar);
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU3 = ch3.U(fkaVar);
                } catch (Throwable th33) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th33);
                    Iterator it15 = fjf.a.iterator();
                    while (it15.hasNext()) {
                        AccountInitializer accountInitializer15 = ((n6) it15.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th33);
                            accountInitializer15.d().i().g().a(null, th33);
                        } catch (Throwable th34) {
                            gm0.V("Payload", "failed to collect exception", th34);
                        }
                    }
                    int iD15 = qt4.D(pye.a);
                    if (iD15 != 0) {
                        if (iD15 == 1) {
                            throw th33;
                        }
                        ore.o();
                        return null;
                    }
                    iU3 = 0;
                }
                boolean zL = false;
                for (int i5 = 0; i5 < iU3; i5++) {
                    try {
                        strX3 = ch3.X(fkaVar, null);
                    } catch (Throwable th35) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th35);
                        Iterator it16 = fjf.a.iterator();
                        while (it16.hasNext()) {
                            AccountInitializer accountInitializer16 = ((n6) it16.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th35);
                                accountInitializer16.d().i().g().a(null, th35);
                            } catch (Throwable th36) {
                                gm0.V("Payload", "failed to collect exception", th36);
                            }
                        }
                        int iD16 = qt4.D(pye.a);
                        if (iD16 != 0) {
                            if (iD16 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th35;
                        }
                        strX3 = null;
                    }
                    if (strX3 != null) {
                        try {
                            if (strX3.equals("success")) {
                                try {
                                    zL = ch3.L(fkaVar);
                                } catch (Throwable th37) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th37);
                                    Iterator it17 = fjf.a.iterator();
                                    while (it17.hasNext()) {
                                        AccountInitializer accountInitializer17 = ((n6) it17.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th37);
                                            accountInitializer17.d().i().g().a(null, th37);
                                        } catch (Throwable th38) {
                                            gm0.V("Payload", "failed to collect exception", th38);
                                        }
                                    }
                                    int iD17 = qt4.D(pye.a);
                                    if (iD17 != 0) {
                                        if (iD17 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th37;
                                    }
                                    zL = false;
                                }
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th39) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th39);
                                    Iterator it18 = fjf.a.iterator();
                                    while (it18.hasNext()) {
                                        AccountInitializer accountInitializer18 = ((n6) it18.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th39);
                                            accountInitializer18.d().i().g().a(null, th39);
                                        } catch (Throwable th40) {
                                            gm0.V("Payload", "failed to collect exception", th40);
                                        }
                                    }
                                    int iD18 = qt4.D(pye.a);
                                    if (iD18 != 0) {
                                        if (iD18 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th39;
                                    }
                                }
                            }
                        } catch (Throwable th41) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th41);
                                Iterator it19 = fjf.a.iterator();
                                while (it19.hasNext()) {
                                    AccountInitializer accountInitializer19 = ((n6) it19.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th41);
                                        accountInitializer19.d().i().g().a(null, th41);
                                    } catch (Throwable th42) {
                                        gm0.V("Payload", "failed to collect exception", th42);
                                    }
                                }
                                int iD19 = qt4.D(pye.a);
                                if (iD19 != 0) {
                                    if (iD19 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th41;
                                }
                            } catch (Throwable th43) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th43);
                                Iterator it20 = fjf.a.iterator();
                                while (it20.hasNext()) {
                                    AccountInitializer accountInitializer20 = ((n6) it20.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th43);
                                        accountInitializer20.d().i().g().a(null, th43);
                                    } catch (Throwable th44) {
                                        gm0.V("Payload", "failed to collect exception", th44);
                                    }
                                }
                                int iD20 = qt4.D(pye.a);
                                if (iD20 != 0) {
                                    if (iD20 == 1) {
                                        throw th43;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    break;
                }
                return new mtg(zL);
            case 6:
                return y(fkaVar);
            case 9:
                return z(fkaVar);
            case 10:
                return A(fkaVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x034e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0358  */
    /* JADX WARN: Code duplicated, block: B:143:0x035c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0398  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:159:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:161:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:162:0x03df  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x0411  */
    /* JADX WARN: Code duplicated, block: B:171:0x0422  */
    /* JADX WARN: Code duplicated, block: B:174:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x043d  */
    /* JADX WARN: Code duplicated, block: B:180:0x045c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0460  */
    /* JADX WARN: Code duplicated, block: B:187:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:196:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x038f -> B:149:0x0392). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0174 -> B:33:0x017e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object n(java.util.List r44, java.util.List r45, boolean r46, defpackage.nq4 r47) {
        /*
            Method dump skipped, instruction units count: 1475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku6.n(java.util.List, java.util.List, boolean, nq4):java.lang.Object");
    }

    public edc r(Context context) {
        if (n == null) {
            synchronized (this) {
                if (n == null) {
                    n = new edc(context);
                }
            }
        }
        return n;
    }

    @Override // defpackage.xhe
    public Object s(long j2, int i2, int i3, long j3, long j4, nq4 nq4Var) {
        return new Integer(0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[Catch: all -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ab, blocks: (B:29:0x00a1, B:24:0x0079, B:32:0x00af), top: B:55:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a0 -> B:55:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object u(java.io.File r18, java.io.InputStream r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku6.u(java.io.File, java.io.InputStream, nq4):java.lang.Object");
    }
}
