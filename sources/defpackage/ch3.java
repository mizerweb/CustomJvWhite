package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Process;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import one.me.android.initialization.AccountInitializer;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class ch3 {
    public static final lq4[] a = new lq4[0];
    public static final ste b = new ste("DISK_USAGE", 2);
    public static final gp0 c = new gp0(20);
    public static final int[] d = {R.attr.colorPrimary};
    public static final int[] e = {R.attr.colorPrimaryVariant};
    public static dsc f;
    public static volatile String g;
    public static x3f h;

    /* JADX WARN: Code duplicated, block: B:553:0x0656 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static b93 A(fka fkaVar) {
        int iU;
        b93 b93Var;
        String strX;
        String str = 0;
        try {
            iU = U(fkaVar);
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
        int i = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        boolean zL6 = false;
        boolean zL7 = false;
        boolean zL8 = false;
        boolean zL9 = false;
        boolean zL10 = false;
        boolean zL11 = false;
        boolean zL12 = false;
        boolean zL13 = false;
        boolean zL14 = false;
        boolean zL15 = false;
        boolean zL16 = false;
        boolean zL17 = false;
        while (i < iU) {
            try {
                b93Var = str;
                strX = X(fkaVar, str);
            } catch (Throwable th3) {
                b93Var = str;
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
                strX = b93Var;
            }
            if (strX != 0) {
                try {
                    b93Var = b93Var;
                    switch (strX.hashCode()) {
                        case -1991141764:
                            if (!strX.equals("A_PLUS_CHANNEL")) {
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
                                        if (iD3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th5;
                                    }
                                }
                            } else {
                                try {
                                    zL12 = L(fkaVar);
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
                                    zL12 = false;
                                }
                            }
                            break;
                        case -1878686423:
                            if (!strX.equals("CONFIRM_BEFORE_SEND")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL16 = L(fkaVar);
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
                                    zL16 = false;
                                }
                            }
                            break;
                        case -1588574526:
                            if (!strX.equals("SERVICE_CHAT")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL9 = L(fkaVar);
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
                                    zL9 = false;
                                }
                            }
                            break;
                        case -1549139865:
                            if (!strX.equals("COMMENTS_DISABLED")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL15 = L(fkaVar);
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
                                        if (iD7 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th13;
                                    }
                                    zL15 = false;
                                }
                            }
                            break;
                        case -1351652841:
                            if (!strX.equals("MEMBERS_CAN_SEE_PRIVATE_LINK")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL10 = L(fkaVar);
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
                                        if (iD8 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th15;
                                    }
                                    zL10 = false;
                                }
                            }
                            break;
                        case -985184211:
                            if (!strX.equals("SENT_BY_PHONE")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL8 = L(fkaVar);
                                } catch (Throwable th17) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                    Iterator it9 = fjf.a.iterator();
                                    while (it9.hasNext()) {
                                        AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th17);
                                            accountInitializer9.d().i().g().a(null, th17);
                                        } catch (Throwable th18) {
                                            gm0.V("Payload", "failed to collect exception", th18);
                                        }
                                    }
                                    int iD9 = qt4.D(pye.a);
                                    if (iD9 != 0) {
                                        if (iD9 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th17;
                                    }
                                    zL8 = false;
                                }
                            }
                            break;
                        case -314593712:
                            if (!strX.equals("ALL_CAN_PIN_MESSAGE")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL5 = L(fkaVar);
                                } catch (Throwable th19) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                    Iterator it10 = fjf.a.iterator();
                                    while (it10.hasNext()) {
                                        AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th19);
                                            accountInitializer10.d().i().g().a(null, th19);
                                        } catch (Throwable th20) {
                                            gm0.V("Payload", "failed to collect exception", th20);
                                        }
                                    }
                                    int iD10 = qt4.D(pye.a);
                                    if (iD10 != 0) {
                                        if (iD10 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th19;
                                    }
                                    zL5 = false;
                                }
                            }
                            break;
                        case -94228390:
                            if (!strX.equals("JOIN_REQUEST")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL13 = L(fkaVar);
                                } catch (Throwable th21) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                                    Iterator it11 = fjf.a.iterator();
                                    while (it11.hasNext()) {
                                        AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th21);
                                            accountInitializer11.d().i().g().a(null, th21);
                                        } catch (Throwable th22) {
                                            gm0.V("Payload", "failed to collect exception", th22);
                                        }
                                    }
                                    int iD11 = qt4.D(pye.a);
                                    if (iD11 != 0) {
                                        if (iD11 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th21;
                                    }
                                    zL13 = false;
                                }
                            }
                            break;
                        case -45011922:
                            if (!strX.equals("DISABLE_FORWARD")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL17 = L(fkaVar);
                                } catch (Throwable th23) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                                    Iterator it12 = fjf.a.iterator();
                                    while (it12.hasNext()) {
                                        AccountInitializer accountInitializer12 = ((n6) it12.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th23);
                                            accountInitializer12.d().i().g().a(null, th23);
                                        } catch (Throwable th24) {
                                            gm0.V("Payload", "failed to collect exception", th24);
                                        }
                                    }
                                    int iD12 = qt4.D(pye.a);
                                    if (iD12 != 0) {
                                        if (iD12 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th23;
                                    }
                                    zL17 = false;
                                }
                            }
                            break;
                        case 2524:
                            if (!strX.equals("OK")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL6 = L(fkaVar);
                                } catch (Throwable th25) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                    Iterator it13 = fjf.a.iterator();
                                    while (it13.hasNext()) {
                                        AccountInitializer accountInitializer13 = ((n6) it13.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th25);
                                            accountInitializer13.d().i().g().a(null, th25);
                                        } catch (Throwable th26) {
                                            gm0.V("Payload", "failed to collect exception", th26);
                                        }
                                    }
                                    int iD13 = qt4.D(pye.a);
                                    if (iD13 != 0) {
                                        if (iD13 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th25;
                                    }
                                    zL6 = false;
                                }
                            }
                            break;
                        case 17337067:
                            if (!strX.equals("OFFICIAL")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL3 = L(fkaVar);
                                } catch (Throwable th27) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th27);
                                    Iterator it14 = fjf.a.iterator();
                                    while (it14.hasNext()) {
                                        AccountInitializer accountInitializer14 = ((n6) it14.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th27);
                                            accountInitializer14.d().i().g().a(null, th27);
                                        } catch (Throwable th28) {
                                            gm0.V("Payload", "failed to collect exception", th28);
                                        }
                                    }
                                    int iD14 = qt4.D(pye.a);
                                    if (iD14 != 0) {
                                        if (iD14 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th27;
                                    }
                                    zL3 = false;
                                }
                            }
                            break;
                        case 180211188:
                            if (!strX.equals("COMMENTS")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL14 = L(fkaVar);
                                } catch (Throwable th29) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th29);
                                    Iterator it15 = fjf.a.iterator();
                                    while (it15.hasNext()) {
                                        AccountInitializer accountInitializer15 = ((n6) it15.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th29);
                                            accountInitializer15.d().i().g().a(null, th29);
                                        } catch (Throwable th30) {
                                            gm0.V("Payload", "failed to collect exception", th30);
                                        }
                                    }
                                    int iD15 = qt4.D(pye.a);
                                    if (iD15 != 0) {
                                        if (iD15 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th29;
                                    }
                                    zL14 = false;
                                }
                            }
                            break;
                        case 199439097:
                            if (!strX.equals("CONTENT_LEVEL_CHAT")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL11 = L(fkaVar);
                                } catch (Throwable th31) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th31);
                                    Iterator it16 = fjf.a.iterator();
                                    while (it16.hasNext()) {
                                        AccountInitializer accountInitializer16 = ((n6) it16.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th31);
                                            accountInitializer16.d().i().g().a(null, th31);
                                        } catch (Throwable th32) {
                                            gm0.V("Payload", "failed to collect exception", th32);
                                        }
                                    }
                                    int iD16 = qt4.D(pye.a);
                                    if (iD16 != 0) {
                                        if (iD16 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th31;
                                    }
                                    zL11 = false;
                                }
                            }
                            break;
                        case 247284269:
                            if (!strX.equals("SIGN_ADMIN")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL = L(fkaVar);
                                } catch (Throwable th33) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th33);
                                    Iterator it17 = fjf.a.iterator();
                                    while (it17.hasNext()) {
                                        AccountInitializer accountInitializer17 = ((n6) it17.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th33);
                                            accountInitializer17.d().i().g().a(null, th33);
                                        } catch (Throwable th34) {
                                            gm0.V("Payload", "failed to collect exception", th34);
                                        }
                                    }
                                    int iD17 = qt4.D(pye.a);
                                    if (iD17 != 0) {
                                        if (iD17 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th33;
                                    }
                                    zL = false;
                                }
                            }
                            break;
                        case 513557962:
                            if (!strX.equals("ONLY_ADMIN_CAN_ADD_MEMBER")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL4 = L(fkaVar);
                                } catch (Throwable th35) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th35);
                                    Iterator it18 = fjf.a.iterator();
                                    while (it18.hasNext()) {
                                        AccountInitializer accountInitializer18 = ((n6) it18.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th35);
                                            accountInitializer18.d().i().g().a(null, th35);
                                        } catch (Throwable th36) {
                                            gm0.V("Payload", "failed to collect exception", th36);
                                        }
                                    }
                                    int iD18 = qt4.D(pye.a);
                                    if (iD18 != 0) {
                                        if (iD18 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th35;
                                    }
                                    zL4 = false;
                                }
                            }
                            break;
                        case 687393168:
                            if (!strX.equals("ONLY_ADMIN_CAN_CALL")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL7 = L(fkaVar);
                                } catch (Throwable th37) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th37);
                                    Iterator it19 = fjf.a.iterator();
                                    while (it19.hasNext()) {
                                        AccountInitializer accountInitializer19 = ((n6) it19.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th37);
                                            accountInitializer19.d().i().g().a(null, th37);
                                        } catch (Throwable th38) {
                                            gm0.V("Payload", "failed to collect exception", th38);
                                        }
                                    }
                                    int iD19 = qt4.D(pye.a);
                                    if (iD19 != 0) {
                                        if (iD19 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th37;
                                    }
                                    zL7 = false;
                                }
                            }
                            break;
                        case 861231443:
                            if (!strX.equals("ONLY_OWNER_CAN_CHANGE_ICON_TITLE")) {
                                fkaVar.x();
                            } else {
                                try {
                                    zL2 = L(fkaVar);
                                } catch (Throwable th39) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th39);
                                    Iterator it20 = fjf.a.iterator();
                                    while (it20.hasNext()) {
                                        AccountInitializer accountInitializer20 = ((n6) it20.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th39);
                                            accountInitializer20.d().i().g().a(null, th39);
                                        } catch (Throwable th40) {
                                            gm0.V("Payload", "failed to collect exception", th40);
                                        }
                                    }
                                    int iD20 = qt4.D(pye.a);
                                    if (iD20 != 0) {
                                        if (iD20 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th39;
                                    }
                                    zL2 = false;
                                }
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th41) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th41);
                        Iterator it21 = fjf.a.iterator();
                        while (it21.hasNext()) {
                            AccountInitializer accountInitializer21 = ((n6) it21.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th41);
                                accountInitializer21.d().i().g().a(null, th41);
                            } catch (Throwable th42) {
                                gm0.V("Payload", "failed to collect exception", th42);
                            }
                        }
                        int iD21 = qt4.D(pye.a);
                        if (iD21 != 0) {
                            if (iD21 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th41;
                        }
                    } catch (Throwable th43) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th43);
                        Iterator it22 = fjf.a.iterator();
                        while (it22.hasNext()) {
                            AccountInitializer accountInitializer22 = ((n6) it22.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th43);
                                accountInitializer22.d().i().g().a(null, th43);
                            } catch (Throwable th44) {
                                gm0.V("Payload", "failed to collect exception", th44);
                            }
                        }
                        int iD22 = qt4.D(pye.a);
                        if (iD22 != 0) {
                            if (iD22 == 1) {
                                throw th43;
                            }
                            ore.o();
                            return b93Var;
                        }
                    }
                }
            } else {
                b93Var = b93Var;
            }
            i++;
            str = b93Var;
        }
        return new b93(zL, zL2, zL3, zL4, zL5, zL6, zL7, zL8, zL9, zL10, zL11, zL12, zL13, zL14, zL15, zL16, zL17);
    }

    public static TypedArray B(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        d(context, attributeSet, i, i2);
        f(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void C(yia yiaVar, Map map) throws IOException {
        yiaVar.I(map.size());
        for (Map.Entry entry : map.entrySet()) {
            D(yiaVar, entry.getKey());
            D(yiaVar, entry.getValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x0335  */
    /* JADX WARN: Code duplicated, block: B:197:0x0338  */
    /* JADX WARN: Code duplicated, block: B:198:0x0347  */
    /* JADX WARN: Code duplicated, block: B:201:0x0373  */
    public static void D(final yia yiaVar, Object obj) throws IOException {
        ylc ylcVar;
        ylc ylcVar2;
        Long lValueOf;
        ylc ylcVar3;
        long j;
        if (obj instanceof String) {
            yiaVar.P((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            yiaVar.A(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            yiaVar.E(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            yiaVar.g(5);
            MessageBuffer messageBuffer = yiaVar.e;
            int i = yiaVar.f;
            yiaVar.f = i + 1;
            messageBuffer.putByte(i, (byte) -54);
            yiaVar.e.putFloat(yiaVar.f, fFloatValue);
            yiaVar.f += 4;
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            yiaVar.g(9);
            MessageBuffer messageBuffer2 = yiaVar.e;
            int i2 = yiaVar.f;
            yiaVar.f = i2 + 1;
            messageBuffer2.putByte(i2, (byte) -53);
            yiaVar.e.putDouble(yiaVar.f, dDoubleValue);
            yiaVar.f += 8;
            return;
        }
        if (obj instanceof Short) {
            short sShortValue = ((Short) obj).shortValue();
            if (sShortValue < -32) {
                if (sShortValue < -128) {
                    yiaVar.t0((byte) -47, sShortValue);
                    return;
                } else {
                    yiaVar.k0((byte) -48, (byte) sShortValue);
                    return;
                }
            }
            if (sShortValue < 128) {
                yiaVar.Y((byte) sShortValue);
                return;
            } else if (sShortValue < 256) {
                yiaVar.k0((byte) -52, (byte) sShortValue);
                return;
            } else {
                yiaVar.t0((byte) -51, sShortValue);
                return;
            }
        }
        if (obj instanceof Byte) {
            byte bByteValue = ((Byte) obj).byteValue();
            if (bByteValue < -32) {
                yiaVar.k0((byte) -48, bByteValue);
                return;
            } else {
                yiaVar.Y(bByteValue);
                return;
            }
        }
        if (obj instanceof Boolean) {
            yiaVar.y(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            yiaVar.l(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                D(yiaVar, it.next());
            }
            return;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            yiaVar.l(set.size());
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                D(yiaVar, it2.next());
            }
            return;
        }
        if (obj instanceof Map) {
            C(yiaVar, (Map) obj);
            return;
        }
        final int i3 = 0;
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            yiaVar.l(jArr.length);
            int length = jArr.length;
            while (i3 < length) {
                yiaVar.E(jArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length2 = bArr.length;
            if (length2 < 256) {
                yiaVar.k0((byte) -60, (byte) length2);
            } else if (length2 < 65536) {
                yiaVar.t0((byte) -59, (short) length2);
            } else {
                yiaVar.o0(length2, (byte) -58);
            }
            int length3 = bArr.length;
            MessageBuffer messageBuffer3 = yiaVar.e;
            if (messageBuffer3 != null) {
                int size = messageBuffer3.size();
                int i4 = yiaVar.f;
                if (size - i4 >= length3 && length3 <= yiaVar.b) {
                    yiaVar.e.putBytes(i4, bArr, 0, length3);
                    yiaVar.f += length3;
                    return;
                }
            }
            yiaVar.flush();
            yiaVar.d.write(bArr, 0, length3);
            return;
        }
        long j2 = 128;
        long j3 = 255;
        final int i5 = 2;
        if (obj instanceof c9b) {
            c9b c9bVar = (c9b) obj;
            yiaVar.l(c9bVar.d);
            cf7 cf7Var = new cf7() { // from class: b4b
                @Override // defpackage.cf7
                public final Object invoke(Object obj2) {
                    int i6 = i3;
                    sbi sbiVar = sbi.a;
                    yia yiaVar2 = yiaVar;
                    switch (i6) {
                        case 0:
                            try {
                                ch3.D(yiaVar2, obj2);
                                return sbiVar;
                            } catch (IOException unused) {
                                ore.q("bad packing of ScatterSet");
                                return null;
                            }
                        case 1:
                            try {
                                yiaVar2.E(((Long) obj2).longValue());
                                return sbiVar;
                            } catch (IOException unused2) {
                                ore.q("bad packing of LongSet");
                                return null;
                            }
                        default:
                            try {
                                yiaVar2.A(((Integer) obj2).intValue());
                                return sbiVar;
                            } catch (IOException unused3) {
                                ore.q("bad packing of IntSet");
                                return null;
                            }
                    }
                }
            };
            Object[] objArr = c9bVar.b;
            long[] jArr2 = c9bVar.a;
            int length4 = jArr2.length - 2;
            if (length4 < 0) {
                return;
            }
            int i6 = 0;
            while (true) {
                long j4 = jArr2[i6];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length4)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < j2) {
                            cf7Var.invoke(objArr[(i6 << 3) + i8]);
                        }
                        j4 >>= 8;
                        i8++;
                        j2 = j2;
                    }
                    j = j2;
                    if (i7 != 8) {
                        return;
                    }
                } else {
                    j = j2;
                }
                if (i6 == length4) {
                    return;
                }
                i6++;
                j2 = j;
            }
        } else if (obj instanceof m8b) {
            m8b m8bVar = (m8b) obj;
            yiaVar.l(m8bVar.d);
            final int i9 = 1;
            cf7 cf7Var2 = new cf7() { // from class: b4b
                @Override // defpackage.cf7
                public final Object invoke(Object obj2) {
                    int i10 = i9;
                    sbi sbiVar = sbi.a;
                    yia yiaVar2 = yiaVar;
                    switch (i10) {
                        case 0:
                            try {
                                ch3.D(yiaVar2, obj2);
                                return sbiVar;
                            } catch (IOException unused) {
                                ore.q("bad packing of ScatterSet");
                                return null;
                            }
                        case 1:
                            try {
                                yiaVar2.E(((Long) obj2).longValue());
                                return sbiVar;
                            } catch (IOException unused2) {
                                ore.q("bad packing of LongSet");
                                return null;
                            }
                        default:
                            try {
                                yiaVar2.A(((Integer) obj2).intValue());
                                return sbiVar;
                            } catch (IOException unused3) {
                                ore.q("bad packing of IntSet");
                                return null;
                            }
                    }
                }
            };
            long[] jArr3 = m8bVar.b;
            long[] jArr4 = m8bVar.a;
            int length5 = jArr4.length - 2;
            if (length5 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j5 = jArr4[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length5)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j5 & 255) < 128) {
                            cf7Var2.invoke(Long.valueOf(jArr3[(i10 << 3) + i12]));
                        }
                        j5 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length5) {
                    return;
                } else {
                    i10++;
                }
            }
        } else if (obj instanceof f8b) {
            f8b f8bVar = (f8b) obj;
            yiaVar.l(f8bVar.d);
            cf7 cf7Var3 = new cf7() { // from class: b4b
                @Override // defpackage.cf7
                public final Object invoke(Object obj2) {
                    int i13 = i5;
                    sbi sbiVar = sbi.a;
                    yia yiaVar2 = yiaVar;
                    switch (i13) {
                        case 0:
                            try {
                                ch3.D(yiaVar2, obj2);
                                return sbiVar;
                            } catch (IOException unused) {
                                ore.q("bad packing of ScatterSet");
                                return null;
                            }
                        case 1:
                            try {
                                yiaVar2.E(((Long) obj2).longValue());
                                return sbiVar;
                            } catch (IOException unused2) {
                                ore.q("bad packing of LongSet");
                                return null;
                            }
                        default:
                            try {
                                yiaVar2.A(((Integer) obj2).intValue());
                                return sbiVar;
                            } catch (IOException unused3) {
                                ore.q("bad packing of IntSet");
                                return null;
                            }
                    }
                }
            };
            int[] iArr = f8bVar.b;
            long[] jArr5 = f8bVar.a;
            int length6 = jArr5.length - 2;
            if (length6 < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j6 = jArr5[i13];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length6)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j6 & 255) < 128) {
                            cf7Var3.invoke(Integer.valueOf(iArr[(i13 << 3) + i15]));
                        }
                        j6 >>= 8;
                    }
                    if (i14 != 8) {
                        return;
                    }
                }
                if (i13 == length6) {
                    return;
                } else {
                    i13++;
                }
            }
        } else {
            if (!(obj instanceof p1f)) {
                if (obj instanceof l40) {
                    C(yiaVar, ((l40) obj).a());
                    return;
                }
                if (obj instanceof zic) {
                    C(yiaVar, ((zic) obj).a());
                    return;
                }
                if (obj instanceof bjc) {
                    C(yiaVar, ((bjc) obj).a());
                    return;
                }
                if (!(obj instanceof aga)) {
                    if (obj instanceof l8b) {
                        l8b l8bVar = (l8b) obj;
                        yiaVar.I(l8bVar.e);
                        l8bVar.e(new s81(11, yiaVar));
                        return;
                    } else if (obj instanceof a4b) {
                        ((a4b) obj).a(yiaVar);
                        return;
                    } else if (obj == null) {
                        ore.q("value == null");
                        return;
                    } else {
                        ore.q(c0a.o("type ", obj.getClass().getName(), " isn't yet implemented"));
                        return;
                    }
                }
                aga agaVar = (aga) obj;
                String str = agaVar.b;
                long j7 = agaVar.a;
                if (j7 <= 0) {
                    if (str == null || str.length() == 0) {
                        ylcVar = null;
                    } else {
                        ylcVar2 = new ylc("entityName", str);
                    }
                    lValueOf = Long.valueOf(j7);
                    if (j7 <= 0) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        ylcVar3 = new ylc("entityId", Long.valueOf(lValueOf.longValue()));
                    } else {
                        ylcVar3 = null;
                    }
                    ylc ylcVar4 = new ylc("type", agaVar.c.name());
                    ylc ylcVar5 = new ylc("from", Short.valueOf(agaVar.d));
                    ylc ylcVar6 = new ylc("length", Short.valueOf(agaVar.e));
                    Map map = agaVar.f;
                    C(yiaVar, wm9.W0(a.Y0(new ylc[]{ylcVar, ylcVar3, ylcVar4, ylcVar5, ylcVar6, map != null ? new ylc("attributes", map) : null})));
                    return;
                }
                ylcVar2 = new ylc("entityId", Long.valueOf(j7));
                ylcVar = ylcVar2;
                lValueOf = Long.valueOf(j7);
                if (j7 <= 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    ylcVar3 = new ylc("entityId", Long.valueOf(lValueOf.longValue()));
                } else {
                    ylcVar3 = null;
                }
                ylc ylcVar7 = new ylc("type", agaVar.c.name());
                ylc ylcVar8 = new ylc("from", Short.valueOf(agaVar.d));
                ylc ylcVar9 = new ylc("length", Short.valueOf(agaVar.e));
                Map map2 = agaVar.f;
                C(yiaVar, wm9.W0(a.Y0(new ylc[]{ylcVar, ylcVar3, ylcVar7, ylcVar8, ylcVar9, map2 != null ? new ylc("attributes", map2) : null})));
                return;
            }
            p1f p1fVar = (p1f) obj;
            yiaVar.I(p1fVar.e);
            Object[] objArr2 = p1fVar.b;
            Object[] objArr3 = p1fVar.c;
            long[] jArr6 = p1fVar.a;
            int length7 = jArr6.length - 2;
            if (length7 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j8 = jArr6[i16];
                long j9 = j3;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length7)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j8 & j9) < 128) {
                            int i19 = (i16 << 3) + i18;
                            Object obj2 = objArr2[i19];
                            Object obj3 = objArr3[i19];
                            try {
                                D(yiaVar, obj2);
                                D(yiaVar, obj3);
                            } catch (IOException e2) {
                                throw new es6("bad packing of ScatterMap", e2);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length7) {
                    return;
                }
                i16++;
                j3 = j9;
            }
        }
    }

    public static be9 E(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            ore.p("Only buffers with backing array supported");
            return null;
        }
        long j = byteBuffer.getLong();
        int i = byteBuffer.getInt();
        if (i < 0) {
            ore.p(zo5.h(i, "Negative message length: "));
            return null;
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferUnderflowException();
        }
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        be9 be9Var = new be9(j, a.T0(iPosition, byteBuffer.array(), iPosition + i));
        byteBuffer.position(byteBuffer.position() + i);
        return be9Var;
    }

    public static Object F(gri griVar) {
        switch (qt4.D(griVar.a())) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(((o88) griVar).B());
            case 2:
                return Long.valueOf(griVar.c().m());
            case 3:
                return Float.valueOf(((t88) griVar).B());
            case 4:
                return griVar.o().C();
            case 5:
                return ByteBuffer.wrap(griVar.r().a).asReadOnlyBuffer();
            case 6:
                k88 k88VarB = griVar.b();
                int size = k88VarB.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(F(k88VarB.B(i)));
                }
                return arrayList;
            case 7:
                k98 k98VarD = griVar.d();
                HashMap map = new HashMap(k98VarD.a.length / 2);
                Iterator it = new gw(k98VarD.a).iterator();
                while (true) {
                    i98 i98Var = (i98) it;
                    if (!i98Var.hasNext()) {
                        return map;
                    }
                    Map.Entry entry = (Map.Entry) i98Var.next();
                    map.put(F((gri) entry.getKey()), F((gri) entry.getValue()));
                }
                break;
            default:
                ore.q(c0a.o("Type ", nbh.H(griVar.a()), " isn't yet implemented"));
                return null;
        }
    }

    public static final Object G(rre rreVar, boolean z, boolean z2, cf7 cf7Var) {
        ThreadLocal threadLocal = rreVar.i;
        rreVar.a();
        if (rreVar.j() && !rreVar.k()) {
            vt4 vt4Var = (vt4) threadLocal.get();
            if ((vt4Var != null ? (mzh) vt4Var.x0(mzh.b) : null) != null) {
                ore.k("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        vt4 vt4Var2 = (vt4) threadLocal.get();
        if (vt4Var2 == null) {
            vt4Var2 = k66.a;
        }
        return lvb.z0(new m05(vt4Var2, rreVar, z2, z, cf7Var, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object H(lq4 lq4Var, cf7 cf7Var, rre rreVar) {
        n05 n05Var;
        cf7 cf7Var2;
        if (lq4Var instanceof n05) {
            n05Var = (n05) lq4Var;
            int i = n05Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                n05Var.g = i - Integer.MIN_VALUE;
            } else {
                n05Var = new n05(lq4Var);
            }
        } else {
            n05Var = new n05(lq4Var);
        }
        Object objN = n05Var.f;
        int i2 = n05Var.g;
        Object obj = hu4.a;
        if (i2 == 0) {
            d0(objN);
            if (rreVar.j()) {
                p05 p05Var = new p05(rreVar, cf7Var, null, 0);
                n05Var.g = 1;
                Object objQ = vd7.Q(n05Var, p05Var, rreVar);
                if (objQ != obj) {
                    return objQ;
                }
            } else if (rreVar.j() && rreVar.m() && rreVar.k()) {
                vk4 vk4Var = new vk4((lq4) null, cf7Var, rreVar);
                n05Var.g = 2;
                Object objQ2 = rreVar.q(false, vk4Var, n05Var);
                if (objQ2 != obj) {
                    return objQ2;
                }
            } else {
                n05Var.d = rreVar;
                n05Var.e = (mdh) cf7Var;
                n05Var.g = 3;
                objN = n(rreVar, true, n05Var);
                cf7Var2 = cf7Var;
                if (objN != obj) {
                }
            }
        }
        if (i2 == 1) {
            d0(objN);
            return objN;
        }
        if (i2 == 2) {
            d0(objN);
            return objN;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                d0(objN);
                return objN;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cf7 cf7Var3 = (cf7) n05Var.e;
        rreVar = n05Var.d;
        d0(objN);
        cf7Var2 = cf7Var3;
        qh4 qh4Var = new qh4((lq4) null, cf7Var2, rreVar);
        n05Var.d = null;
        n05Var.e = null;
        n05Var.g = 4;
        Object objK0 = yab.K0((vt4) objN, qh4Var, n05Var);
        return objK0 == obj ? obj : objK0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object I(lq4 lq4Var, rre rreVar, boolean z, boolean z2, cf7 cf7Var) {
        q05 q05Var;
        rre rreVar2;
        boolean z3;
        boolean z4;
        cf7 cf7Var2;
        if (lq4Var instanceof q05) {
            q05Var = (q05) lq4Var;
            int i = q05Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                q05Var.i = i - Integer.MIN_VALUE;
            } else {
                q05Var = new q05(lq4Var);
            }
        } else {
            q05Var = new q05(lq4Var);
        }
        q05 q05Var2 = q05Var;
        Object obj = q05Var2.h;
        int i2 = q05Var2.i;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            d0(obj);
            if (rreVar.j() && rreVar.m() && rreVar.k()) {
                k05 k05Var = new k05(z2, z, rreVar, null, cf7Var, 1);
                q05Var2.i = 1;
                Object objQ = rreVar.q(z, k05Var, q05Var2);
                if (objQ != hu4Var) {
                    return objQ;
                }
            } else {
                q05Var2.d = rreVar;
                q05Var2.e = cf7Var;
                q05Var2.f = z;
                q05Var2.g = z2;
                q05Var2.i = 2;
                vt4 vt4VarN = n(rreVar, z2, q05Var2);
                if (vt4VarN != hu4Var) {
                    rreVar2 = rreVar;
                    z3 = z;
                    obj = vt4VarN;
                    z4 = z2;
                    cf7Var2 = cf7Var;
                }
            }
        }
        if (i2 == 1) {
            d0(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = q05Var2.g;
        boolean z6 = q05Var2.f;
        cf7 cf7Var3 = q05Var2.e;
        rre rreVar3 = q05Var2.d;
        d0(obj);
        z4 = z5;
        z3 = z6;
        cf7Var2 = cf7Var3;
        rreVar2 = rreVar3;
        l05 l05Var = new l05((lq4) null, rreVar2, z3, z4, cf7Var2);
        q05Var2.d = null;
        q05Var2.e = null;
        q05Var2.i = 3;
        Object objK0 = yab.K0((vt4) obj, l05Var, q05Var2);
        return objK0 == hu4Var ? hu4Var : objK0;
    }

    public static int J(fka fkaVar) {
        if (fkaVar.y().a() == 7) {
            return fkaVar.t0();
        }
        fkaVar.x();
        return 0;
    }

    public static byte[] K(fka fkaVar) {
        if (fkaVar.y().a() == 6) {
            return fkaVar.k0(fkaVar.u0());
        }
        fkaVar.x();
        return null;
    }

    public static boolean L(fka fkaVar) {
        if (fkaVar.y().a() == 2) {
            return fkaVar.v0();
        }
        fkaVar.x();
        return false;
    }

    public static Long M(fka fkaVar) {
        if (fkaVar.y().a() == 3) {
            return Long.valueOf(fkaVar.I0());
        }
        fkaVar.x();
        return null;
    }

    public static byte N(fka fkaVar) {
        if (fkaVar.y().a() == 3) {
            return fkaVar.x0();
        }
        fkaVar.x();
        return (byte) 0;
    }

    public static Byte O(fka fkaVar) {
        if (fkaVar.y().a() == 3) {
            return Byte.valueOf(fkaVar.x0());
        }
        fkaVar.x();
        return null;
    }

    public static double P(fka fkaVar, double d2) {
        if (fkaVar.y().a() != 4) {
            fkaVar.x();
            return d2;
        }
        byte b2 = fkaVar.readByte();
        if (b2 == -54) {
            return fkaVar.P(4).getFloat(fkaVar.k);
        }
        if (b2 == -53) {
            return fkaVar.P(8).getDouble(fkaVar.k);
        }
        throw fka.r0(b2, "Float");
    }

    public static float Q(fka fkaVar) {
        if (fkaVar.y().a() == 4) {
            return fkaVar.z0();
        }
        fkaVar.x();
        return 0.0f;
    }

    public static int R(fka fkaVar, int i) {
        if (fkaVar.y().a() == 3) {
            return fkaVar.D0();
        }
        fkaVar.x();
        return i;
    }

    public static Integer S(fka fkaVar) {
        if (fkaVar.y().a() == 3) {
            return Integer.valueOf(fkaVar.D0());
        }
        fkaVar.x();
        return null;
    }

    public static long T(fka fkaVar, long j) {
        if (fkaVar.y().a() == 3) {
            return fkaVar.I0();
        }
        fkaVar.x();
        return j;
    }

    public static int U(fka fkaVar) {
        if (fkaVar.y().a() == 8) {
            return fkaVar.P0();
        }
        fkaVar.x();
        return 0;
    }

    public static short V(fka fkaVar) {
        if (fkaVar.y().a() != 3) {
            fkaVar.x();
            return (short) 0;
        }
        byte b2 = fkaVar.readByte();
        if (lvb.u0(b2)) {
            return b2;
        }
        switch (b2) {
            case -52:
                return (short) (fkaVar.readByte() & 255);
            case -51:
                short s = fkaVar.readShort();
                if (s >= 0) {
                    return s;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(s & 65535));
            case -50:
                int i = fkaVar.readInt();
                if (i < 0 || i > 32767) {
                    throw fka.I(i);
                }
                return (short) i;
            case -49:
                long j = fkaVar.readLong();
                if (j < 0 || j > 32767) {
                    throw fka.K(j);
                }
                return (short) j;
            case -48:
                return fkaVar.readByte();
            case -47:
                return fkaVar.readShort();
            case -46:
                int i2 = fkaVar.readInt();
                if (i2 < -32768 || i2 > 32767) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i2));
                }
                return (short) i2;
            case -45:
                long j2 = fkaVar.readLong();
                if (j2 < -32768 || j2 > 32767) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j2));
                }
                return (short) j2;
            default:
                throw fka.r0(b2, "Integer");
        }
    }

    public static String W(fka fkaVar) {
        if (fkaVar.y().a() == 5) {
            return fkaVar.S0();
        }
        fkaVar.x();
        return null;
    }

    public static String X(fka fkaVar, String str) {
        if (fkaVar.y().a() == 5) {
            return fkaVar.S0();
        }
        fkaVar.x();
        return str;
    }

    public static void Y(Map map, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        via viaVar = xia.b;
        viaVar.getClass();
        yia yiaVar = new yia(new OutputStreamBufferOutput(byteArrayOutputStream, 8192), viaVar);
        try {
            yiaVar.I(map.size());
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                yiaVar.P(str);
                D(yiaVar, obj);
            }
            yiaVar.close();
        } catch (Throwable th) {
            yiaVar.close();
            throw th;
        }
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            return charSequence.equals(charSequence2);
        }
        return charSequence2 == null;
    }

    public static final Executor b(xt4 xt4Var) {
        Executor executorS0;
        pd6 pd6Var = xt4Var instanceof pd6 ? (pd6) xt4Var : null;
        return (pd6Var == null || (executorS0 = pd6Var.S0()) == null) ? new wn5(xt4Var) : executorS0;
    }

    public static final Object c(Collection collection, lq4 lq4Var) {
        return collection.isEmpty() ? r66.a : new dl0((xf5[]) collection.toArray(new xf5[0])).a(lq4Var);
    }

    public static void d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.C, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                g(context, e, "Theme.MaterialComponents");
            }
        }
        g(context, d, "Theme.AppCompat");
    }

    public static final void d0(Object obj) {
        if (obj instanceof poe) {
            throw ((poe) obj).a;
        }
    }

    public static void e(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ore.n(zo5.h(i2, "at index "));
                return;
            }
        }
    }

    public static Bitmap e0(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
            ore.p("bitmap is null");
            return null;
        }
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }

    public static void f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.C, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        ore.p("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static ArrayList f0(fka fkaVar, c4b c4bVar) {
        if (fkaVar.y().a() != 7) {
            fkaVar.x();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iT0 = fkaVar.t0();
        for (int i = 0; i < iT0; i++) {
            arrayList.add(c4bVar.h(fkaVar));
        }
        return arrayList;
    }

    public static void g(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                ore.p(c0a.o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void g0(RippleDrawable rippleDrawable, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = rippleDrawable.getBounds().left;
        }
        if ((i4 & 2) != 0) {
            i2 = rippleDrawable.getBounds().top;
        }
        int i5 = rippleDrawable.getBounds().right;
        if ((i4 & 8) != 0) {
            i3 = rippleDrawable.getBounds().bottom;
        }
        rippleDrawable.setBounds(i, i2, i5, i3);
    }

    public static eg4 h(wf4 wf4Var) {
        eg4 eg4Var = new eg4();
        eg4Var.c(wf4Var);
        return eg4Var;
    }

    public static final void h0(gdi gdiVar) {
        gdiVar.d(36, new g(5));
        gdiVar.d(37, new g(6));
        gdiVar.d(38, new mh(0));
        gdiVar.d(39, new mh(1));
        gdiVar.d(40, new mh(2));
        gdiVar.d(41, new g(7));
        gdiVar.d(42, new g(8));
        gdiVar.d(43, new g(9));
        gdiVar.d(44, new mh(3));
    }

    public static final r07 i(rre rreVar, String[] strArr, cf7 cf7Var) {
        jl8 jl8Var = rreVar.f;
        if (jl8Var == null) {
            jl8Var = null;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        nub nubVar = jl8Var.c;
        ylc ylcVarL = nubVar.l(strArr2);
        String[] strArr3 = (String[]) ylcVarL.a;
        xx6 byeVar = new bye(new l83(nubVar, (int[]) ylcVarL.b, strArr3, (lq4) null, 15));
        i5b i5bVar = jl8Var.j;
        o24 o24VarB = i5bVar != null ? i5bVar.b(strArr3) : null;
        if (o24VarB != null) {
            byeVar = e9i.m0(byeVar, o24VarB);
        }
        return new r07(e9i.m(byeVar, -1, 2), rreVar, cf7Var, 1);
    }

    public static final void i0(gdi gdiVar) {
        gdiVar.d(61, new dp0(14));
        gdiVar.d(703, new cp0(3));
        gdiVar.d(704, new dp0(25));
        gdiVar.d(62, new dp0(29));
        gdiVar.d(705, new fc1(0));
        gdiVar.d(367, new fc1(1));
        gdiVar.b(2, new f(12));
        gdiVar.d(706, new fc1(2));
        gdiVar.d(59, new fc1(3));
        gdiVar.d(63, new fc1(4));
        gdiVar.d(707, new fc1(5));
        gdiVar.d(664, new dp0(4));
        gdiVar.d(708, new dp0(5));
        gdiVar.d(709, new dp0(6));
        gdiVar.d(710, new dp0(7));
        gdiVar.d(711, new cp0(4));
        gdiVar.d(712, new cp0(5));
        gdiVar.d(713, new dp0(8));
        gdiVar.d(714, new cp0(6));
        gdiVar.d(715, new dp0(9));
        gdiVar.d(66, new dp0(10));
        gdiVar.d(716, new dp0(11));
        gdiVar.d(717, new dp0(12));
        gdiVar.d(718, new dp0(13));
        gdiVar.d(60, new dp0(15));
        gdiVar.d(719, new dp0(16));
        gdiVar.d(720, new dp0(17));
        gdiVar.d(721, new dp0(18));
        gdiVar.d(55, new dp0(19));
        gdiVar.d(56, new dp0(20));
        gdiVar.d(57, new dp0(21));
        gdiVar.d(58, new dp0(22));
        gdiVar.d(722, new dp0(23));
        gdiVar.d(723, new f(14));
        gdiVar.d(724, new cp0(7));
        gdiVar.d(725, new dp0(24));
        gdiVar.d(726, new cp0(8));
        gdiVar.b(7, new f(13));
        gdiVar.d(727, new f(15));
        gdiVar.d(728, new cp0(9));
        gdiVar.d(729, new cp0(10));
        gdiVar.d(730, new dp0(26));
        gdiVar.d(731, new dp0(27));
        gdiVar.d(732, new dp0(28));
    }

    public static final ArrayList j(List list) {
        ml8 ml8Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((ll8) it.next()).ordinal();
            if (iOrdinal == 0) {
                ml8Var = new ml8(ll8.a, new tnh(R.string.oneme_invite_by_phone_action), Integer.valueOf(R.drawable.icon_call_by_number));
            } else {
                if (iOrdinal != 1) {
                    ore.o();
                    return null;
                }
                ml8Var = new ml8(ll8.b, new tnh(R.string.oneme_invite_by_link_action), Integer.valueOf(R.drawable.icon_link));
            }
            arrayList.add(ml8Var);
        }
        return arrayList;
    }

    public static final void j0(gdi gdiVar) {
        gdiVar.b(3, new y6f(26));
        gdiVar.d(327, new eaf(5));
        gdiVar.d(328, new eaf(6));
        gdiVar.d(323, new eaf(7));
        gdiVar.d(329, new eaf(8));
    }

    public static Object k(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return F(xia.a(bArr).T0());
            } catch (IOException e2) {
                qr7.o(e2);
            }
        }
        return null;
    }

    public static final void k0(gdi gdiVar) {
        gdiVar.d(949, new qqg(13));
        gdiVar.d(954, new r1i(16));
        gdiVar.d(951, new qqg(16));
        gdiVar.d(956, new dp0(2));
        gdiVar.d(964, new qqg(18));
        gdiVar.d(966, new qqg(17));
        gdiVar.d(953, new qqg(14));
        gdiVar.b(3, new bwf(28));
        gdiVar.d(955, new eaf(24));
    }

    public static final Object l(gbd gbdVar, String str, nq4 nq4Var) {
        Object objA = gbdVar.a(str, new nre(15), nq4Var);
        return objA == hu4.a ? objA : sbi.a;
    }

    public static final xt4 m(Executor executor) {
        xt4 xt4Var;
        wn5 wn5Var = executor instanceof wn5 ? (wn5) executor : null;
        return (wn5Var == null || (xt4Var = wn5Var.a) == null) ? new qd6(executor) : xt4Var;
    }

    public static final vt4 n(rre rreVar, boolean z, nq4 nq4Var) {
        mzh mzhVar = (mzh) nq4Var.getContext().x0(mzh.b);
        vt4 vt4Var = mzhVar != null ? mzhVar.a : null;
        if (!rreVar.j()) {
            dq4 dq4Var = rreVar.a;
            vt4 vt4Var2 = (dq4Var != null ? dq4Var : null).a;
            if (vt4Var == null) {
                vt4Var = k66.a;
            }
            return vt4Var2.u0(vt4Var);
        }
        if (vt4Var != null) {
            dq4 dq4Var2 = rreVar.a;
            return (dq4Var2 != null ? dq4Var2 : null).a.u0(vt4Var);
        }
        if (!z) {
            dq4 dq4Var3 = rreVar.a;
            return (dq4Var3 != null ? dq4Var3 : null).a;
        }
        vt4 vt4Var3 = rreVar.b;
        if (vt4Var3 == null) {
            return null;
        }
        return vt4Var3;
    }

    public static final dsc o(Context context) {
        dsc dscVar = f;
        if (dscVar != null) {
            return dscVar;
        }
        dsc dscVar2 = new dsc(context.getApplicationContext());
        f = dscVar2;
        return dscVar2;
    }

    public static final String p() {
        String strI = g;
        if (strI == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                strI = Application.getProcessName();
            } else {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("/proc/" + Process.myPid() + "/cmdline")), pt2.d);
                    try {
                        strI = gm0.I(inputStreamReader);
                        int length = strI.length();
                        for (int i = 0; i < length; i++) {
                            if (cqk.i(strI.charAt(i), 0) <= 0) {
                                strI = strI.substring(0, i);
                                break;
                            }
                            strI = "unknown";
                        }
                        inputStreamReader.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(inputStreamReader, th);
                            throw th2;
                        }
                    }
                } catch (Throwable unused) {
                    strI = "unknown";
                }
            }
            g = strI;
        }
        return strI;
    }

    public static boolean r(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean s(CharSequence charSequence) {
        return !r(charSequence);
    }

    public static String t(Collection collection) {
        if (collection == null) {
            return null;
        }
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(cxl.b(it.next()));
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(Collection collection, lq4 lq4Var) {
        kl0 kl0Var;
        Iterator it;
        if (lq4Var instanceof kl0) {
            kl0Var = (kl0) lq4Var;
            int i = kl0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kl0Var.f = i - Integer.MIN_VALUE;
            } else {
                kl0Var = new kl0(lq4Var);
            }
        } else {
            kl0Var = new kl0(lq4Var);
        }
        Object obj = kl0Var.e;
        int i2 = kl0Var.f;
        if (i2 == 0) {
            d0(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = kl0Var.d;
            d0(obj);
        }
        while (it.hasNext()) {
            vo8 vo8Var = (vo8) it.next();
            kl0Var.d = it;
            kl0Var.f = 1;
            Object objG = vo8Var.g(kl0Var);
            hu4 hu4Var = hu4.a;
            if (objG == hu4Var) {
                return hu4Var;
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object v(defpackage.vo8[] r6, defpackage.nq4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.jl0
            if (r0 == 0) goto L13
            r0 = r7
            jl0 r0 = (defpackage.jl0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            jl0 r0 = new jl0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r6 = r0.f
            int r1 = r0.e
            java.lang.Object[] r3 = r0.d
            vo8[] r3 = (defpackage.vo8[]) r3
            d0(r7)
            r7 = r3
            goto L52
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            r6 = 0
            return r6
        L35:
            d0(r7)
            int r7 = r6.length
            r1 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3d:
            if (r1 >= r6) goto L54
            r3 = r7[r1]
            r0.d = r7
            r0.e = r1
            r0.f = r6
            r0.h = r2
            java.lang.Object r3 = r3.g(r0)
            hu4 r4 = defpackage.hu4.a
            if (r3 != r4) goto L52
            return r4
        L52:
            int r1 = r1 + r2
            goto L3d
        L54:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch3.v(vo8[], nq4):java.lang.Object");
    }

    public static float w(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final void x(qg7 qg7Var, List list) {
        qg7Var.r("history↓");
        if (list.isEmpty()) {
            qg7Var.r("empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        kw7 kw7VarN = p90.n(list);
        if (kw7VarN != null) {
            sb.append(kw7VarN.getA());
            sb.append(" ");
        }
        sb.append("║║");
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            kw7 kw7Var = (kw7) list.get(i);
            if (kw7Var instanceof jw7) {
                sb.append(" GAP ║║");
            } else {
                kw7 kw7Var2 = i > 0 ? (kw7) list.get(i - 1) : null;
                if ((kw7Var2 instanceof jw7) || kw7Var2 == null) {
                    sb.append(" ");
                    sb.append(qg7.h(kw7Var.getC()));
                    sb.append(" - ");
                    i2 = 0;
                }
                i2++;
                kw7 kw7Var3 = i < list.size() + (-1) ? (kw7) list.get(i + 1) : null;
                if ((kw7Var3 instanceof jw7) || kw7Var3 == null) {
                    sb.append(qg7.h(kw7Var.getC()));
                    sb.append(" (" + i2 + ")");
                    sb.append(" ║║");
                }
            }
            i++;
        }
        kw7 kw7VarG = p90.G(list);
        if (kw7VarG != null) {
            sb.append(" ");
            sb.append(kw7VarG.getA());
        }
        qg7Var.r(sb.toString());
    }

    public static String y(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return "";
        }
        int length = charSequence.length() / 4;
        if (length == 0) {
            length = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("*");
        }
        sb.append(charSequence.subSequence(length, charSequence.length()));
        return sb.toString();
    }

    public static String z(Map map) {
        StringBuilder sb = new StringBuilder("{");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(y((CharSequence) entry.getValue()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public abstract void Z(boolean z);

    public abstract void a0(boolean z);

    public abstract void b0();

    public abstract void c0(int i);

    public abstract void q(int i);
}
