package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.c;
import androidx.lifecycle.SavedStateHandlesVM;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.deviceid.storage.DeviceIdFileDataSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.a;
import kotlinx.coroutines.DispatchException;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class yab {
    public static zab a;
    public static volatile String c;
    public static final Object b = new Object();
    public static final i68 d = new i68("drawable", ".drawable");
    public static final a8g e = new a8g(23);
    public static final j85 f = new j85(23);
    public static final xvc g = new xvc(23);

    public static final boolean A(float f2, float f3) {
        return Math.abs(f2 - f3) < 1.0E-6f;
    }

    public static final Object A0(vt4 vt4Var, qf7 qf7Var) throws Throwable {
        nc6 nc6VarA;
        vt4 vt4VarW;
        long jV0;
        Thread threadCurrentThread = Thread.currentThread();
        ut4 ut4Var = khb.f;
        xt4 xt4Var = (xt4) vt4Var.x0(ut4Var);
        k66 k66Var = k66.a;
        if (xt4Var == null) {
            nc6VarA = qqh.a();
            vt4VarW = n1g.w(k66Var, vt4Var.u0(nc6VarA), true);
            hd5 hd5Var = ao5.b;
            if (vt4VarW != hd5Var && vt4VarW.x0(ut4Var) == null) {
                vt4VarW = vt4VarW.u0(hd5Var);
            }
        } else {
            nc6VarA = (nc6) qqh.a.get();
            vt4VarW = n1g.w(k66Var, vt4Var, true);
            hd5 hd5Var2 = ao5.b;
            if (vt4VarW != hd5Var2 && vt4VarW.x0(ut4Var) == null) {
                vt4VarW = vt4VarW.u0(hd5Var2);
            }
        }
        jz0 jz0Var = new jz0(vt4VarW, threadCurrentThread, nc6VarA);
        jz0Var.m0(1, jz0Var, qf7Var);
        nc6 nc6Var = jz0Var.g;
        if (nc6Var != null) {
            int i = nc6.f;
            nc6Var.U0(false);
        }
        while (true) {
            if (nc6Var != null) {
                try {
                    jV0 = nc6Var.V0();
                } catch (Throwable th) {
                    if (nc6Var != null) {
                        int i2 = nc6.f;
                        nc6Var.S0(false);
                    }
                    throw th;
                }
            } else {
                jV0 = BuildConfig.MAX_TIME_TO_UPLOAD;
            }
            if (jz0Var.W()) {
                break;
            }
            LockSupport.parkNanos(jz0Var, jV0);
            if (Thread.interrupted()) {
                jz0Var.q(new InterruptedException());
            }
        }
        if (nc6Var != null) {
            int i3 = nc6.f;
            nc6Var.S0(false);
        }
        Object objM0 = rx8.m0(jz0Var.J());
        s64 s64Var = objM0 instanceof s64 ? (s64) objM0 : null;
        if (s64Var == null) {
            return objM0;
        }
        throw s64Var.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:202:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:204:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:205:0x09db  */
    /* JADX WARN: Code duplicated, block: B:207:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:208:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:209:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:210:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:218:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:220:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:221:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:222:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:223:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:224:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:226:0x0ab9  */
    /* JADX WARN: Code duplicated, block: B:227:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:228:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:229:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:230:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:231:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:232:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:233:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:235:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:236:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:237:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:239:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:241:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:243:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0b55  */
    /* JADX WARN: Code duplicated, block: B:245:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:249:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:250:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:251:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:252:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:253:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:254:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:255:0x0bb9  */
    /* JADX WARN: Code duplicated, block: B:256:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:257:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:258:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:259:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:260:0x0be1  */
    /* JADX WARN: Code duplicated, block: B:262:0x0bf4  */
    /* JADX WARN: Code duplicated, block: B:263:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:264:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:267:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0c22  */
    /* JADX WARN: Code duplicated, block: B:269:0x0c28  */
    /* JADX WARN: Code duplicated, block: B:270:0x0c30  */
    /* JADX WARN: Code duplicated, block: B:271:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x012e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0307  */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0073. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0076. Please report as an issue. */
    public static String B(String str) {
        int i;
        int i2;
        if (ch3.r(str)) {
            return str;
        }
        char[] cArr = new char[str.length() * 4];
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char c2 = charArray[i4];
            if (c2 < 128) {
                i2 = i3 + 1;
                cArr[i3] = c2;
            } else {
                if (c2 == 178) {
                    i = i3 + 1;
                    cArr[i3] = '2';
                    i3 = i;
                } else if (c2 == 179) {
                    i = i3 + 1;
                    cArr[i3] = '3';
                    i3 = i;
                } else if (c2 == 420) {
                    i = i3 + 1;
                    cArr[i3] = 'P';
                    i3 = i;
                } else if (c2 == 421) {
                    i = i3 + 1;
                    cArr[i3] = 'p';
                    i3 = i;
                } else if (c2 != 613 && c2 != 614) {
                    switch (c2) {
                        case 171:
                        case 187:
                        case 8220:
                        case 8221:
                        case 8222:
                        case 8243:
                        case 8246:
                        case 10077:
                        case 10078:
                        case 10094:
                        case 10095:
                        case 65282:
                            i = i3 + 1;
                            cArr[i3] = '\"';
                            i3 = i;
                            break;
                        case 185:
                        case 8321:
                        case 9312:
                        case 9461:
                        case 10102:
                        case 10112:
                        case 10122:
                        case 65297:
                            i = i3 + 1;
                            cArr[i3] = '1';
                            i3 = i;
                            break;
                        case 248:
                        case 333:
                        case 335:
                        case 337:
                        case 7446:
                        case 7447:
                        case 7575:
                        case 7757:
                        case 7759:
                        case 7761:
                        case 7763:
                        case 7885:
                        case 7887:
                        case 7889:
                        case 7891:
                        case 7893:
                        case 7895:
                        case 7897:
                        case 7899:
                        case 7901:
                        case 7903:
                        case 7905:
                        case 7907:
                        case 8338:
                        case 9438:
                        case 11386:
                        case 42827:
                        case 42829:
                        case 65359:
                            i = i3 + 1;
                            cArr[i3] = 'o';
                            i3 = i;
                            break;
                        case 249:
                        case 250:
                        case 251:
                        case 252:
                        case 361:
                        case 363:
                        case 365:
                        case 367:
                        case 369:
                        case 371:
                        case 649:
                        case 7524:
                        case 7577:
                        case 7795:
                        case 7797:
                        case 7799:
                        case 7801:
                        case 7803:
                        case 7909:
                        case 7911:
                        case 7913:
                        case 7915:
                        case 7917:
                        case 7919:
                        case 7921:
                        case 9444:
                        case 65365:
                            i = i3 + 1;
                            cArr[i3] = 'u';
                            i3 = i;
                            break;
                        case 253:
                        case 255:
                        case 375:
                        case 654:
                        case 7823:
                        case 7833:
                        case 7923:
                        case 7925:
                        case 7927:
                        case 7929:
                        case 7935:
                        case 9448:
                        case 65369:
                            i = i3 + 1;
                            cArr[i3] = 'y';
                            i3 = i;
                            break;
                        case 254:
                        case 7546:
                        case 42855:
                            int i5 = i3 + 1;
                            cArr[i3] = 't';
                            i3 += 2;
                            cArr[i5] = 'h';
                            break;
                        case np0.n /* 256 */:
                        case 258:
                        case 260:
                        case 7424:
                        case 7680:
                        case 7840:
                        case 7842:
                        case 7844:
                        case 7846:
                        case 7848:
                        case 7850:
                        case 7852:
                        case 7854:
                        case 7856:
                        case 7858:
                        case 7860:
                        case 7862:
                        case 9398:
                        case 65313:
                            i = i3 + 1;
                            cArr[i3] = 'A';
                            i3 = i;
                            break;
                        case 257:
                        case 259:
                        case 261:
                        case 7567:
                        case 7573:
                        case 7681:
                        case 7834:
                        case 7841:
                        case 7843:
                        case 7845:
                        case 7847:
                        case 7849:
                        case 7851:
                        case 7853:
                        case 7855:
                        case 7857:
                        case 7859:
                        case 7861:
                        case 7863:
                        case 8336:
                        case 8340:
                        case 9424:
                        case 11365:
                        case 11375:
                        case 65345:
                            i = i3 + 1;
                            cArr[i3] = 'a';
                            i3 = i;
                            break;
                        case 262:
                        case 264:
                        case 266:
                        case 268:
                        case 663:
                        case 7428:
                        case 7688:
                        case 9400:
                        case 65315:
                            i = i3 + 1;
                            cArr[i3] = 'C';
                            i3 = i;
                            break;
                        case 263:
                        case 265:
                        case 267:
                        case 269:
                        case 7689:
                        case 8580:
                        case 9426:
                        case 42814:
                        case 42815:
                        case 65347:
                            i = i3 + 1;
                            cArr[i3] = 'c';
                            i3 = i;
                            break;
                        case 270:
                        case 272:
                        case 7429:
                        case 7430:
                        case 7690:
                        case 7692:
                        case 7694:
                        case 7696:
                        case 7698:
                        case 9401:
                        case 42873:
                        case 65316:
                            i = i3 + 1;
                            cArr[i3] = 'D';
                            i3 = i;
                            break;
                        case 271:
                        case 273:
                        case 7533:
                        case 7553:
                        case 7569:
                        case 7691:
                        case 7693:
                        case 7695:
                        case 7697:
                        case 7699:
                        case 9427:
                        case 42874:
                        case 65348:
                            i = i3 + 1;
                            cArr[i3] = 'd';
                            i3 = i;
                            break;
                        case 274:
                        case 276:
                        case 278:
                        case 280:
                        case 282:
                        case 7431:
                        case 7700:
                        case 7702:
                        case 7704:
                        case 7706:
                        case 7708:
                        case 7864:
                        case 7866:
                        case 7868:
                        case 7870:
                        case 7872:
                        case 7874:
                        case 7876:
                        case 7878:
                        case 9402:
                        case 11387:
                        case 65317:
                            i = i3 + 1;
                            cArr[i3] = 'E';
                            i3 = i;
                            break;
                        case 275:
                        case 277:
                        case 279:
                        case 281:
                        case 283:
                        case 666:
                        case 7432:
                        case 7570:
                        case 7571:
                        case 7572:
                        case 7701:
                        case 7703:
                        case 7705:
                        case 7707:
                        case 7709:
                        case 7865:
                        case 7867:
                        case 7869:
                        case 7871:
                        case 7873:
                        case 7875:
                        case 7877:
                        case 7879:
                        case 8337:
                        case 9428:
                        case 11384:
                        case 65349:
                            i = i3 + 1;
                            cArr[i3] = 'e';
                            i3 = i;
                            break;
                        case 284:
                        case 286:
                        case 288:
                        case 290:
                        case 667:
                        case 7712:
                        case 9404:
                        case 42877:
                        case 42878:
                        case 65319:
                            i = i3 + 1;
                            cArr[i3] = 'G';
                            i3 = i;
                            break;
                        case 285:
                        case 287:
                        case 289:
                        case 291:
                        case 7543:
                        case 7545:
                        case 7555:
                        case 7713:
                        case 9430:
                        case 42879:
                        case 65351:
                            i = i3 + 1;
                            cArr[i3] = 'g';
                            i3 = i;
                            break;
                        case 292:
                        case 294:
                        case 668:
                        case 7714:
                        case 7716:
                        case 7718:
                        case 7720:
                        case 7722:
                        case 9405:
                        case 11367:
                        case 11381:
                        case 65320:
                            i = i3 + 1;
                            cArr[i3] = 'H';
                            i3 = i;
                            break;
                        case 293:
                        case 295:
                        case 686:
                        case 687:
                        case 7715:
                        case 7717:
                        case 7719:
                        case 7721:
                        case 7723:
                        case 7830:
                        case 9431:
                        case 11368:
                        case 11382:
                        case 65352:
                            i = i3 + 1;
                            cArr[i3] = 'h';
                            i3 = i;
                            break;
                        case 296:
                        case 298:
                        case 300:
                        case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                        case HttpStatus.SC_NOT_MODIFIED /* 304 */:
                        case 7547:
                        case 7724:
                        case 7726:
                        case 7880:
                        case 7882:
                        case 9406:
                        case 43006:
                        case 65321:
                            i = i3 + 1;
                            cArr[i3] = 'I';
                            i3 = i;
                            break;
                        case 297:
                        case 299:
                        case 301:
                        case HttpStatus.SC_SEE_OTHER /* 303 */:
                        case HttpStatus.SC_USE_PROXY /* 305 */:
                        case 616:
                        case 7433:
                        case 7522:
                        case 7548:
                        case 7574:
                        case 7725:
                        case 7727:
                        case 7881:
                        case 7883:
                        case 8305:
                        case 9432:
                        case 65353:
                            i = i3 + 1;
                            cArr[i3] = 'i';
                            i3 = i;
                            break;
                        case 306:
                            int i6 = i3 + 1;
                            cArr[i3] = 'I';
                            i3 += 2;
                            cArr[i6] = 'J';
                            break;
                        case HttpStatus.SC_TEMPORARY_REDIRECT /* 307 */:
                            int i7 = i3 + 1;
                            cArr[i3] = 'i';
                            i3 += 2;
                            cArr[i7] = 'j';
                            break;
                        case 308:
                        case 7434:
                        case 9407:
                        case 65322:
                            i = i3 + 1;
                            cArr[i3] = 'J';
                            i3 = i;
                            break;
                        case 309:
                        case 644:
                        case 669:
                        case 9433:
                        case 11388:
                        case 65354:
                            i = i3 + 1;
                            cArr[i3] = 'j';
                            i3 = i;
                            break;
                        case 310:
                        case 7435:
                        case 7728:
                        case 7730:
                        case 7732:
                        case 9408:
                        case 11369:
                        case 42816:
                        case 42818:
                        case 42820:
                        case 65323:
                            i = i3 + 1;
                            cArr[i3] = 'K';
                            i3 = i;
                            break;
                        case 311:
                        case 670:
                        case 7556:
                        case 7729:
                        case 7731:
                        case 7733:
                        case 9434:
                        case 11370:
                        case 42817:
                        case 42819:
                        case 42821:
                        case 65355:
                            i = i3 + 1;
                            cArr[i3] = 'k';
                            i3 = i;
                            break;
                        case 312:
                        case 672:
                        case 9440:
                        case 42839:
                        case 42841:
                        case 65361:
                            i = i3 + 1;
                            cArr[i3] = 'q';
                            i3 = i;
                            break;
                        case 313:
                        case 315:
                        case 317:
                        case 319:
                        case 321:
                        case 671:
                        case 7436:
                        case 7734:
                        case 7736:
                        case 7738:
                        case 7740:
                        case 9409:
                        case 11360:
                        case 11362:
                        case 42822:
                        case 42824:
                        case 42880:
                        case 65324:
                            i = i3 + 1;
                            cArr[i3] = 'L';
                            i3 = i;
                            break;
                        case 314:
                        case 316:
                        case 318:
                        case 320:
                        case 322:
                        case 7557:
                        case 7735:
                        case 7737:
                        case 7739:
                        case 7741:
                        case 9435:
                        case 11361:
                        case 42823:
                        case 42825:
                        case 42881:
                        case 65356:
                            i = i3 + 1;
                            cArr[i3] = 'l';
                            i3 = i;
                            break;
                        case 323:
                        case 325:
                        case 327:
                        case 330:
                        case 7438:
                        case 7748:
                        case 7750:
                        case 7752:
                        case 7754:
                        case 9411:
                        case 65326:
                            i = i3 + 1;
                            cArr[i3] = 'N';
                            i3 = i;
                            break;
                        case 324:
                        case 326:
                        case 328:
                        case 329:
                        case 331:
                        case 7536:
                        case 7559:
                        case 7749:
                        case 7751:
                        case 7753:
                        case 7755:
                        case 8319:
                        case 9437:
                        case 65358:
                            i = i3 + 1;
                            cArr[i3] = 'n';
                            i3 = i;
                            break;
                        case 332:
                        case 334:
                        case 336:
                        case 7439:
                        case 7440:
                        case 7756:
                        case 7758:
                        case 7760:
                        case 7762:
                        case 7884:
                        case 7886:
                        case 7888:
                        case 7890:
                        case 7892:
                        case 7894:
                        case 7896:
                        case 7898:
                        case 7900:
                        case 7902:
                        case 7904:
                        case 7906:
                        case 9412:
                        case 42826:
                        case 42828:
                        case 65327:
                            i = i3 + 1;
                            cArr[i3] = 'O';
                            i3 = i;
                            break;
                        case 338:
                            int i8 = i3 + 1;
                            cArr[i3] = 'O';
                            i3 += 2;
                            cArr[i8] = 'E';
                            break;
                        case 339:
                        case 7444:
                            int i9 = i3 + 1;
                            cArr[i3] = 'o';
                            i3 += 2;
                            cArr[i9] = 'e';
                            break;
                        case 340:
                        case 342:
                        case 344:
                        case 7449:
                        case 7450:
                        case 7768:
                        case 7770:
                        case 7772:
                        case 7774:
                        case 9415:
                        case 11364:
                        case 42842:
                        case 42882:
                        case 65330:
                            i = i3 + 1;
                            cArr[i3] = 'R';
                            i3 = i;
                            break;
                        case 341:
                        case 343:
                        case 345:
                        case 7523:
                        case 7538:
                        case 7539:
                        case 7561:
                        case 7769:
                        case 7771:
                        case 7773:
                        case 7775:
                        case 9441:
                        case 42843:
                        case 42883:
                        case 65362:
                            i = i3 + 1;
                            cArr[i3] = 'r';
                            i3 = i;
                            break;
                        case 346:
                        case 348:
                        case 350:
                        case 352:
                        case 7776:
                        case 7778:
                        case 7780:
                        case 7782:
                        case 7784:
                        case 9416:
                        case 42801:
                        case 42885:
                        case 65331:
                            i = i3 + 1;
                            cArr[i3] = 'S';
                            i3 = i;
                            break;
                        case 347:
                        case 349:
                        case 351:
                        case 353:
                        case 383:
                        case 7540:
                        case 7562:
                        case 7777:
                        case 7779:
                        case 7781:
                        case 7783:
                        case 7785:
                        case 7836:
                        case 7837:
                        case 9442:
                        case 42884:
                        case 65363:
                            i = i3 + 1;
                            cArr[i3] = 's';
                            i3 = i;
                            break;
                        case 354:
                        case 356:
                        case 358:
                        case 7451:
                        case 7786:
                        case 7788:
                        case 7790:
                        case 7792:
                        case 9417:
                        case 42886:
                        case 65332:
                            i = i3 + 1;
                            cArr[i3] = 'T';
                            i3 = i;
                            break;
                        case 355:
                        case 357:
                        case 359:
                        case 647:
                        case 648:
                        case 7541:
                        case 7787:
                        case 7789:
                        case 7791:
                        case 7793:
                        case 7831:
                        case 9443:
                        case 11366:
                        case 65364:
                            i = i3 + 1;
                            cArr[i3] = 't';
                            i3 = i;
                            break;
                        case 360:
                        case 362:
                        case 364:
                        case 366:
                        case 368:
                        case 370:
                        case 7452:
                        case 7550:
                        case 7794:
                        case 7796:
                        case 7798:
                        case 7800:
                        case 7802:
                        case 7908:
                        case 7910:
                        case 7912:
                        case 7914:
                        case 7916:
                        case 7918:
                        case 7920:
                        case 9418:
                        case 65333:
                            i = i3 + 1;
                            cArr[i3] = 'U';
                            i3 = i;
                            break;
                        case 372:
                        case 7457:
                        case 7808:
                        case 7810:
                        case 7812:
                        case 7814:
                        case 7816:
                        case 9420:
                        case 11378:
                        case 65335:
                            i = i3 + 1;
                            cArr[i3] = 'W';
                            i3 = i;
                            break;
                        case 373:
                        case 447:
                        case 653:
                        case 7809:
                        case 7811:
                        case 7813:
                        case 7815:
                        case 7817:
                        case 7832:
                        case 9446:
                        case 11379:
                        case 65367:
                            i = i3 + 1;
                            cArr[i3] = 'w';
                            i3 = i;
                            break;
                        case 374:
                        case 376:
                        case 655:
                        case 7822:
                        case 7922:
                        case 7924:
                        case 7926:
                        case 7928:
                        case 7934:
                        case 9422:
                        case 65337:
                            i = i3 + 1;
                            cArr[i3] = 'Y';
                            i3 = i;
                            break;
                        case 377:
                        case 379:
                        case 381:
                        case 7458:
                        case 7824:
                        case 7826:
                        case 7828:
                        case 9423:
                        case 11371:
                        case 42850:
                        case 65338:
                            i = i3 + 1;
                            cArr[i3] = 'Z';
                            i3 = i;
                            break;
                        case 378:
                        case 380:
                        case 382:
                        case 656:
                        case 657:
                        case 7542:
                        case 7566:
                        case 7825:
                        case 7827:
                        case 7829:
                        case 9449:
                        case 11372:
                        case 42851:
                        case 65370:
                            i = i3 + 1;
                            cArr[i3] = 'z';
                            i3 = i;
                            break;
                        case 384:
                        case 387:
                        case 7532:
                        case 7552:
                        case 7683:
                        case 7685:
                        case 7687:
                        case 9425:
                        case 65346:
                            i = i3 + 1;
                            cArr[i3] = 'b';
                            i3 = i;
                            break;
                        case 385:
                        case 386:
                        case 665:
                        case 7427:
                        case 7682:
                        case 7684:
                        case 7686:
                        case 9399:
                        case 65314:
                            i = i3 + 1;
                            cArr[i3] = 'B';
                            i3 = i;
                            break;
                        case 651:
                        case 652:
                        case 7525:
                        case 7564:
                        case 7805:
                        case 7807:
                        case 9445:
                        case 11377:
                        case 11380:
                        case 42847:
                        case 65366:
                            i = i3 + 1;
                            cArr[i3] = 'v';
                            i3 = i;
                            break;
                        case 675:
                        case 677:
                            int i10 = i3 + 1;
                            cArr[i3] = 'd';
                            i3 += 2;
                            cArr[i10] = 'z';
                            break;
                        case 678:
                            int i11 = i3 + 1;
                            cArr[i3] = 't';
                            i3 += 2;
                            cArr[i11] = 's';
                            break;
                        case 680:
                            int i12 = i3 + 1;
                            cArr[i3] = 't';
                            i3 += 2;
                            cArr[i12] = 'c';
                            break;
                        case 682:
                            int i13 = i3 + 1;
                            cArr[i3] = 'l';
                            i3 += 2;
                            cArr[i13] = 's';
                            break;
                        case 683:
                            int i14 = i3 + 1;
                            cArr[i3] = 'l';
                            i3 += 2;
                            cArr[i14] = 'z';
                            break;
                        case 1025:
                            i = i3 + 1;
                            cArr[i3] = 1045;
                            i3 = i;
                            break;
                        case 1105:
                            i = i3 + 1;
                            cArr[i3] = 1077;
                            i3 = i;
                            break;
                        case 7425:
                            int i15 = i3 + 1;
                            cArr[i3] = 'A';
                            i3 += 2;
                            cArr[i15] = 'E';
                            break;
                        case 7426:
                            int i16 = i3 + 1;
                            cArr[i3] = 'a';
                            i3 += 2;
                            cArr[i16] = 'e';
                            break;
                        case 7437:
                        case 7742:
                        case 7744:
                        case 7746:
                        case 9410:
                        case 11374:
                        case 43005:
                        case 43007:
                        case 65325:
                            i = i3 + 1;
                            cArr[i3] = 'M';
                            i3 = i;
                            break;
                        case 7445:
                            int i17 = i3 + 1;
                            cArr[i3] = 'O';
                            i3 += 2;
                            cArr[i17] = 'U';
                            break;
                        case 7448:
                        case 7764:
                        case 7766:
                        case 9413:
                        case 11363:
                        case 42832:
                        case 42834:
                        case 42836:
                        case 65328:
                            i = i3 + 1;
                            cArr[i3] = 'P';
                            i3 = i;
                            break;
                        case 7456:
                        case 7804:
                        case 7806:
                        case 7932:
                        case 9419:
                        case 42846:
                        case 42856:
                        case 65334:
                            i = i3 + 1;
                            cArr[i3] = 'V';
                            i3 = i;
                            break;
                        case 7531:
                            int i18 = i3 + 1;
                            cArr[i3] = 'u';
                            i3 += 2;
                            cArr[i18] = 'e';
                            break;
                        case 7534:
                        case 7554:
                        case 7711:
                        case 7835:
                        case 9429:
                        case 42876:
                        case 65350:
                            i = i3 + 1;
                            cArr[i3] = 'f';
                            i3 = i;
                            break;
                        case 7535:
                        case 7558:
                        case 7743:
                        case 7745:
                        case 7747:
                        case 9436:
                        case 65357:
                            i = i3 + 1;
                            cArr[i3] = 'm';
                            i3 = i;
                            break;
                        case 7537:
                        case 7549:
                        case 7560:
                        case 7765:
                        case 7767:
                        case 9439:
                        case 42833:
                        case 42835:
                        case 42837:
                        case 43004:
                        case 65360:
                            i = i3 + 1;
                            cArr[i3] = 'p';
                            i3 = i;
                            break;
                        case 7565:
                        case 7819:
                        case 7821:
                        case 8339:
                        case 9447:
                        case 65368:
                            i = i3 + 1;
                            cArr[i3] = 'x';
                            i3 = i;
                            break;
                        case 7710:
                        case 9403:
                        case 42800:
                        case 42875:
                        case 43003:
                        case 65318:
                            i = i3 + 1;
                            cArr[i3] = 'F';
                            i3 = i;
                            break;
                        case 7818:
                        case 7820:
                        case 9421:
                        case 65336:
                            i = i3 + 1;
                            cArr[i3] = 'X';
                            i3 = i;
                            break;
                        case 7838:
                            int i19 = i3 + 1;
                            cArr[i3] = 'S';
                            i3 += 2;
                            cArr[i19] = 'S';
                            break;
                        case 7930:
                            int i20 = i3 + 1;
                            cArr[i3] = 'L';
                            i3 += 2;
                            cArr[i20] = 'L';
                            break;
                        case 7931:
                            int i21 = i3 + 1;
                            cArr[i3] = 'l';
                            i3 += 2;
                            cArr[i21] = 'l';
                            break;
                        case 8208:
                        case 8209:
                        case 8210:
                        case 8211:
                        case 8212:
                        case 8315:
                        case 8331:
                        case 65293:
                            i = i3 + 1;
                            cArr[i3] = '-';
                            i3 = i;
                            break;
                        case 8216:
                        case 8217:
                        case 8218:
                        case 8219:
                        case 8242:
                        case 8245:
                        case 8249:
                        case 8250:
                        case 10075:
                        case 10076:
                        case 65287:
                            i = i3 + 1;
                            cArr[i3] = '\'';
                            i3 = i;
                            break;
                        case 8248:
                        case 65342:
                            i = i3 + 1;
                            cArr[i3] = '^';
                            i3 = i;
                            break;
                        case 8252:
                            int i22 = i3 + 1;
                            cArr[i3] = '!';
                            i3 += 2;
                            cArr[i22] = '!';
                            break;
                        case 8260:
                        case 65295:
                            i = i3 + 1;
                            cArr[i3] = '/';
                            i3 = i;
                            break;
                        case 8261:
                        case 10098:
                        case 65339:
                            i = i3 + 1;
                            cArr[i3] = '[';
                            i3 = i;
                            break;
                        case 8262:
                        case 10099:
                        case 65341:
                            i = i3 + 1;
                            cArr[i3] = ']';
                            i3 = i;
                            break;
                        case 8263:
                            int i23 = i3 + 1;
                            cArr[i3] = '?';
                            i3 += 2;
                            cArr[i23] = '?';
                            break;
                        case 8264:
                            int i24 = i3 + 1;
                            cArr[i3] = '?';
                            i3 += 2;
                            cArr[i24] = '!';
                            break;
                        case 8265:
                            int i25 = i3 + 1;
                            cArr[i3] = '!';
                            i3 += 2;
                            cArr[i25] = '?';
                            break;
                        case 8270:
                        case 65290:
                            i = i3 + 1;
                            cArr[i3] = '*';
                            i3 = i;
                            break;
                        case 8271:
                        case 65307:
                            i = i3 + 1;
                            cArr[i3] = ';';
                            i3 = i;
                            break;
                        case 8274:
                        case 65285:
                            i = i3 + 1;
                            cArr[i3] = '%';
                            i3 = i;
                            break;
                        case 8275:
                        case 65374:
                            i = i3 + 1;
                            cArr[i3] = '~';
                            i3 = i;
                            break;
                        case 8304:
                        case 8320:
                        case 9450:
                        case 9471:
                        case 65296:
                            i = i3 + 1;
                            cArr[i3] = '0';
                            i3 = i;
                            break;
                        case 8308:
                        case 8324:
                        case 9315:
                        case 9464:
                        case 10105:
                        case 10115:
                        case 10125:
                        case 65300:
                            i = i3 + 1;
                            cArr[i3] = '4';
                            i3 = i;
                            break;
                        case 8309:
                        case 8325:
                        case 9316:
                        case 9465:
                        case 10106:
                        case 10116:
                        case 10126:
                        case 65301:
                            i = i3 + 1;
                            cArr[i3] = '5';
                            i3 = i;
                            break;
                        case 8310:
                        case 8326:
                        case 9317:
                        case 9466:
                        case 10107:
                        case 10117:
                        case 10127:
                        case 65302:
                            i = i3 + 1;
                            cArr[i3] = '6';
                            i3 = i;
                            break;
                        case 8311:
                        case 8327:
                        case 9318:
                        case 9467:
                        case 10108:
                        case 10118:
                        case 10128:
                        case 65303:
                            i = i3 + 1;
                            cArr[i3] = '7';
                            i3 = i;
                            break;
                        case 8312:
                        case 8328:
                        case 9319:
                        case 9468:
                        case 10109:
                        case 10119:
                        case 10129:
                        case 65304:
                            i = i3 + 1;
                            cArr[i3] = '8';
                            i3 = i;
                            break;
                        case 8313:
                        case 8329:
                        case 9320:
                        case 9469:
                        case 10110:
                        case 10120:
                        case 10130:
                        case 65305:
                            i = i3 + 1;
                            cArr[i3] = '9';
                            i3 = i;
                            break;
                        case 8314:
                        case 8330:
                        case 65291:
                            i = i3 + 1;
                            cArr[i3] = '+';
                            i3 = i;
                            break;
                        case 8316:
                        case 8332:
                        case 65309:
                            i = i3 + 1;
                            cArr[i3] = '=';
                            i3 = i;
                            break;
                        case 8317:
                        case 8333:
                        case 10088:
                        case 10090:
                        case 65288:
                            i = i3 + 1;
                            cArr[i3] = '(';
                            i3 = i;
                            break;
                        case 8318:
                        case 8334:
                        case 10089:
                        case 10091:
                        case 65289:
                            i = i3 + 1;
                            cArr[i3] = ')';
                            i3 = i;
                            break;
                        case 8322:
                        case 9313:
                        case 9462:
                        case 10103:
                        case 10113:
                        case 10123:
                        case 65298:
                            i = i3 + 1;
                            cArr[i3] = '2';
                            i3 = i;
                            break;
                        case 8323:
                        case 9314:
                        case 9463:
                        case 10104:
                        case 10114:
                        case 10124:
                        case 65299:
                            i = i3 + 1;
                            cArr[i3] = '3';
                            i3 = i;
                            break;
                        case 9321:
                        case 9470:
                        case 10111:
                        case 10121:
                        case 10131:
                            int i26 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i26] = '0';
                            break;
                        case 9322:
                        case 9451:
                            int i27 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i27] = '1';
                            break;
                        case 9323:
                        case 9452:
                            int i28 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i28] = '2';
                            break;
                        case 9324:
                        case 9453:
                            int i29 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i29] = '3';
                            break;
                        case 9325:
                        case 9454:
                            int i30 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i30] = '4';
                            break;
                        case 9326:
                        case 9455:
                            int i31 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i31] = '5';
                            break;
                        case 9327:
                        case 9456:
                            int i32 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i32] = '6';
                            break;
                        case 9328:
                        case 9457:
                            int i33 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i33] = '7';
                            break;
                        case 9329:
                        case 9458:
                            int i34 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i34] = '8';
                            break;
                        case 9330:
                        case 9459:
                            int i35 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i35] = '9';
                            break;
                        case 9331:
                        case 9460:
                            int i36 = i3 + 1;
                            cArr[i3] = '2';
                            i3 += 2;
                            cArr[i36] = '0';
                            break;
                        case 9332:
                            cArr[i3] = '(';
                            int i37 = i3 + 2;
                            cArr[i3 + 1] = '1';
                            i3 += 3;
                            cArr[i37] = ')';
                            break;
                        case 9333:
                            cArr[i3] = '(';
                            int i38 = i3 + 2;
                            cArr[i3 + 1] = '2';
                            i3 += 3;
                            cArr[i38] = ')';
                            break;
                        case 9334:
                            cArr[i3] = '(';
                            int i39 = i3 + 2;
                            cArr[i3 + 1] = '3';
                            i3 += 3;
                            cArr[i39] = ')';
                            break;
                        case 9335:
                            cArr[i3] = '(';
                            int i40 = i3 + 2;
                            cArr[i3 + 1] = '4';
                            i3 += 3;
                            cArr[i40] = ')';
                            break;
                        case 9336:
                            cArr[i3] = '(';
                            int i41 = i3 + 2;
                            cArr[i3 + 1] = '5';
                            i3 += 3;
                            cArr[i41] = ')';
                            break;
                        case 9337:
                            cArr[i3] = '(';
                            int i42 = i3 + 2;
                            cArr[i3 + 1] = '6';
                            i3 += 3;
                            cArr[i42] = ')';
                            break;
                        case 9338:
                            cArr[i3] = '(';
                            int i43 = i3 + 2;
                            cArr[i3 + 1] = '7';
                            i3 += 3;
                            cArr[i43] = ')';
                            break;
                        case 9339:
                            cArr[i3] = '(';
                            int i44 = i3 + 2;
                            cArr[i3 + 1] = '8';
                            i3 += 3;
                            cArr[i44] = ')';
                            break;
                        case 9340:
                            cArr[i3] = '(';
                            int i45 = i3 + 2;
                            cArr[i3 + 1] = '9';
                            i3 += 3;
                            cArr[i45] = ')';
                            break;
                        case 9341:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i46 = i3 + 3;
                            cArr[i3 + 2] = '0';
                            i3 += 4;
                            cArr[i46] = ')';
                            break;
                        case 9342:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i47 = i3 + 3;
                            cArr[i3 + 2] = '1';
                            i3 += 4;
                            cArr[i47] = ')';
                            break;
                        case 9343:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i48 = i3 + 3;
                            cArr[i3 + 2] = '2';
                            i3 += 4;
                            cArr[i48] = ')';
                            break;
                        case 9344:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i49 = i3 + 3;
                            cArr[i3 + 2] = '3';
                            i3 += 4;
                            cArr[i49] = ')';
                            break;
                        case 9345:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i50 = i3 + 3;
                            cArr[i3 + 2] = '4';
                            i3 += 4;
                            cArr[i50] = ')';
                            break;
                        case 9346:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i51 = i3 + 3;
                            cArr[i3 + 2] = '5';
                            i3 += 4;
                            cArr[i51] = ')';
                            break;
                        case 9347:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i52 = i3 + 3;
                            cArr[i3 + 2] = '6';
                            i3 += 4;
                            cArr[i52] = ')';
                            break;
                        case 9348:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i53 = i3 + 3;
                            cArr[i3 + 2] = '7';
                            i3 += 4;
                            cArr[i53] = ')';
                            break;
                        case 9349:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i54 = i3 + 3;
                            cArr[i3 + 2] = '8';
                            i3 += 4;
                            cArr[i54] = ')';
                            break;
                        case 9350:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '1';
                            int i55 = i3 + 3;
                            cArr[i3 + 2] = '9';
                            i3 += 4;
                            cArr[i55] = ')';
                            break;
                        case 9351:
                            cArr[i3] = '(';
                            cArr[i3 + 1] = '2';
                            int i56 = i3 + 3;
                            cArr[i3 + 2] = '0';
                            i3 += 4;
                            cArr[i56] = ')';
                            break;
                        case 9352:
                            int i57 = i3 + 1;
                            cArr[i3] = '1';
                            i3 += 2;
                            cArr[i57] = '.';
                            break;
                        case 9353:
                            int i58 = i3 + 1;
                            cArr[i3] = '2';
                            i3 += 2;
                            cArr[i58] = '.';
                            break;
                        case 9354:
                            int i59 = i3 + 1;
                            cArr[i3] = '3';
                            i3 += 2;
                            cArr[i59] = '.';
                            break;
                        case 9355:
                            int i60 = i3 + 1;
                            cArr[i3] = '4';
                            i3 += 2;
                            cArr[i60] = '.';
                            break;
                        case 9356:
                            int i61 = i3 + 1;
                            cArr[i3] = '5';
                            i3 += 2;
                            cArr[i61] = '.';
                            break;
                        case 9357:
                            int i62 = i3 + 1;
                            cArr[i3] = '6';
                            i3 += 2;
                            cArr[i62] = '.';
                            break;
                        case 9358:
                            int i63 = i3 + 1;
                            cArr[i3] = '7';
                            i3 += 2;
                            cArr[i63] = '.';
                            break;
                        case 9359:
                            int i64 = i3 + 1;
                            cArr[i3] = '8';
                            i3 += 2;
                            cArr[i64] = '.';
                            break;
                        case 9360:
                            int i65 = i3 + 1;
                            cArr[i3] = '9';
                            i3 += 2;
                            cArr[i65] = '.';
                            break;
                        case 9361:
                            cArr[i3] = '1';
                            int i66 = i3 + 2;
                            cArr[i3 + 1] = '0';
                            i3 += 3;
                            cArr[i66] = '.';
                            break;
                        case 9362:
                            cArr[i3] = '1';
                            int i67 = i3 + 2;
                            cArr[i3 + 1] = '1';
                            i3 += 3;
                            cArr[i67] = '.';
                            break;
                        case 9363:
                            cArr[i3] = '1';
                            int i68 = i3 + 2;
                            cArr[i3 + 1] = '2';
                            i3 += 3;
                            cArr[i68] = '.';
                            break;
                        case 9364:
                            cArr[i3] = '1';
                            int i69 = i3 + 2;
                            cArr[i3 + 1] = '3';
                            i3 += 3;
                            cArr[i69] = '.';
                            break;
                        case 9365:
                            cArr[i3] = '1';
                            int i70 = i3 + 2;
                            cArr[i3 + 1] = '4';
                            i3 += 3;
                            cArr[i70] = '.';
                            break;
                        case 9366:
                            cArr[i3] = '1';
                            int i71 = i3 + 2;
                            cArr[i3 + 1] = '5';
                            i3 += 3;
                            cArr[i71] = '.';
                            break;
                        case 9367:
                            cArr[i3] = '1';
                            int i72 = i3 + 2;
                            cArr[i3 + 1] = '6';
                            i3 += 3;
                            cArr[i72] = '.';
                            break;
                        case 9368:
                            cArr[i3] = '1';
                            int i73 = i3 + 2;
                            cArr[i3 + 1] = '7';
                            i3 += 3;
                            cArr[i73] = '.';
                            break;
                        case 9369:
                            cArr[i3] = '1';
                            int i74 = i3 + 2;
                            cArr[i3 + 1] = '8';
                            i3 += 3;
                            cArr[i74] = '.';
                            break;
                        case 9370:
                            cArr[i3] = '1';
                            int i75 = i3 + 2;
                            cArr[i3 + 1] = '9';
                            i3 += 3;
                            cArr[i75] = '.';
                            break;
                        case 9371:
                            cArr[i3] = '2';
                            int i76 = i3 + 2;
                            cArr[i3 + 1] = '0';
                            i3 += 3;
                            cArr[i76] = '.';
                            break;
                        case 9372:
                            cArr[i3] = '(';
                            int i77 = i3 + 2;
                            cArr[i3 + 1] = 'a';
                            i3 += 3;
                            cArr[i77] = ')';
                            break;
                        case 9373:
                            cArr[i3] = '(';
                            int i78 = i3 + 2;
                            cArr[i3 + 1] = 'b';
                            i3 += 3;
                            cArr[i78] = ')';
                            break;
                        case 9374:
                            cArr[i3] = '(';
                            int i79 = i3 + 2;
                            cArr[i3 + 1] = 'c';
                            i3 += 3;
                            cArr[i79] = ')';
                            break;
                        case 9375:
                            cArr[i3] = '(';
                            int i80 = i3 + 2;
                            cArr[i3 + 1] = 'd';
                            i3 += 3;
                            cArr[i80] = ')';
                            break;
                        case 9376:
                            cArr[i3] = '(';
                            int i81 = i3 + 2;
                            cArr[i3 + 1] = 'e';
                            i3 += 3;
                            cArr[i81] = ')';
                            break;
                        case 9377:
                            cArr[i3] = '(';
                            int i82 = i3 + 2;
                            cArr[i3 + 1] = 'f';
                            i3 += 3;
                            cArr[i82] = ')';
                            break;
                        case 9378:
                            cArr[i3] = '(';
                            int i83 = i3 + 2;
                            cArr[i3 + 1] = 'g';
                            i3 += 3;
                            cArr[i83] = ')';
                            break;
                        case 9379:
                            cArr[i3] = '(';
                            int i84 = i3 + 2;
                            cArr[i3 + 1] = 'h';
                            i3 += 3;
                            cArr[i84] = ')';
                            break;
                        case 9380:
                            cArr[i3] = '(';
                            int i85 = i3 + 2;
                            cArr[i3 + 1] = 'i';
                            i3 += 3;
                            cArr[i85] = ')';
                            break;
                        case 9381:
                            cArr[i3] = '(';
                            int i86 = i3 + 2;
                            cArr[i3 + 1] = 'j';
                            i3 += 3;
                            cArr[i86] = ')';
                            break;
                        case 9382:
                            cArr[i3] = '(';
                            int i87 = i3 + 2;
                            cArr[i3 + 1] = 'k';
                            i3 += 3;
                            cArr[i87] = ')';
                            break;
                        case 9383:
                            cArr[i3] = '(';
                            int i88 = i3 + 2;
                            cArr[i3 + 1] = 'l';
                            i3 += 3;
                            cArr[i88] = ')';
                            break;
                        case 9384:
                            cArr[i3] = '(';
                            int i89 = i3 + 2;
                            cArr[i3 + 1] = 'm';
                            i3 += 3;
                            cArr[i89] = ')';
                            break;
                        case 9385:
                            cArr[i3] = '(';
                            int i90 = i3 + 2;
                            cArr[i3 + 1] = 'n';
                            i3 += 3;
                            cArr[i90] = ')';
                            break;
                        case 9386:
                            cArr[i3] = '(';
                            int i91 = i3 + 2;
                            cArr[i3 + 1] = 'o';
                            i3 += 3;
                            cArr[i91] = ')';
                            break;
                        case 9387:
                            cArr[i3] = '(';
                            int i92 = i3 + 2;
                            cArr[i3 + 1] = 'p';
                            i3 += 3;
                            cArr[i92] = ')';
                            break;
                        case 9388:
                            cArr[i3] = '(';
                            int i93 = i3 + 2;
                            cArr[i3 + 1] = 'q';
                            i3 += 3;
                            cArr[i93] = ')';
                            break;
                        case 9389:
                            cArr[i3] = '(';
                            int i94 = i3 + 2;
                            cArr[i3 + 1] = 'r';
                            i3 += 3;
                            cArr[i94] = ')';
                            break;
                        case 9390:
                            cArr[i3] = '(';
                            int i95 = i3 + 2;
                            cArr[i3 + 1] = 's';
                            i3 += 3;
                            cArr[i95] = ')';
                            break;
                        case 9391:
                            cArr[i3] = '(';
                            int i96 = i3 + 2;
                            cArr[i3 + 1] = 't';
                            i3 += 3;
                            cArr[i96] = ')';
                            break;
                        case 9392:
                            cArr[i3] = '(';
                            int i97 = i3 + 2;
                            cArr[i3 + 1] = 'u';
                            i3 += 3;
                            cArr[i97] = ')';
                            break;
                        case 9393:
                            cArr[i3] = '(';
                            int i98 = i3 + 2;
                            cArr[i3 + 1] = 'v';
                            i3 += 3;
                            cArr[i98] = ')';
                            break;
                        case 9394:
                            cArr[i3] = '(';
                            int i99 = i3 + 2;
                            cArr[i3 + 1] = 'w';
                            i3 += 3;
                            cArr[i99] = ')';
                            break;
                        case 9395:
                            cArr[i3] = '(';
                            int i100 = i3 + 2;
                            cArr[i3 + 1] = 'x';
                            i3 += 3;
                            cArr[i100] = ')';
                            break;
                        case 9396:
                            cArr[i3] = '(';
                            int i101 = i3 + 2;
                            cArr[i3 + 1] = 'y';
                            i3 += 3;
                            cArr[i101] = ')';
                            break;
                        case 9397:
                            cArr[i3] = '(';
                            int i102 = i3 + 2;
                            cArr[i3 + 1] = 'z';
                            i3 += 3;
                            cArr[i102] = ')';
                            break;
                        case 9414:
                        case 42838:
                        case 42840:
                        case 65329:
                            i = i3 + 1;
                            cArr[i3] = 'Q';
                            i3 = i;
                            break;
                        case 10092:
                        case 10096:
                        case 65308:
                            i = i3 + 1;
                            cArr[i3] = '<';
                            i3 = i;
                            break;
                        case 10093:
                        case 10097:
                        case 65310:
                            i = i3 + 1;
                            cArr[i3] = '>';
                            i3 = i;
                            break;
                        case 10100:
                        case 65371:
                            i = i3 + 1;
                            cArr[i3] = '{';
                            i3 = i;
                            break;
                        case 10101:
                        case 65373:
                            i = i3 + 1;
                            cArr[i3] = '}';
                            i3 = i;
                            break;
                        case 11816:
                            int i103 = i3 + 1;
                            cArr[i3] = '(';
                            i3 += 2;
                            cArr[i103] = '(';
                            break;
                        case 11817:
                            int i104 = i3 + 1;
                            cArr[i3] = ')';
                            i3 += 2;
                            cArr[i104] = ')';
                            break;
                        case 42792:
                            int i105 = i3 + 1;
                            cArr[i3] = 'T';
                            i3 += 2;
                            cArr[i105] = 'Z';
                            break;
                        case 42793:
                            int i106 = i3 + 1;
                            cArr[i3] = 't';
                            i3 += 2;
                            cArr[i106] = 'z';
                            break;
                        case 42802:
                            int i107 = i3 + 1;
                            cArr[i3] = 'A';
                            i3 += 2;
                            cArr[i107] = 'A';
                            break;
                        case 42803:
                            int i108 = i3 + 1;
                            cArr[i3] = 'a';
                            i3 += 2;
                            cArr[i108] = 'a';
                            break;
                        case 42804:
                            int i109 = i3 + 1;
                            cArr[i3] = 'A';
                            i3 += 2;
                            cArr[i109] = 'O';
                            break;
                        case 42805:
                            int i110 = i3 + 1;
                            cArr[i3] = 'a';
                            i3 += 2;
                            cArr[i110] = 'o';
                            break;
                        case 42806:
                            int i111 = i3 + 1;
                            cArr[i3] = 'A';
                            i3 += 2;
                            cArr[i111] = 'U';
                            break;
                        case 42807:
                            int i112 = i3 + 1;
                            cArr[i3] = 'a';
                            i3 += 2;
                            cArr[i112] = 'u';
                            break;
                        case 42808:
                        case 42810:
                            int i113 = i3 + 1;
                            cArr[i3] = 'A';
                            i3 += 2;
                            cArr[i113] = 'V';
                            break;
                        case 42809:
                        case 42811:
                            int i114 = i3 + 1;
                            cArr[i3] = 'a';
                            i3 += 2;
                            cArr[i114] = 'v';
                            break;
                        case 42812:
                            int i115 = i3 + 1;
                            cArr[i3] = 'A';
                            i3 += 2;
                            cArr[i115] = 'Y';
                            break;
                        case 42813:
                            int i116 = i3 + 1;
                            cArr[i3] = 'a';
                            i3 += 2;
                            cArr[i116] = 'y';
                            break;
                        case 42830:
                            int i117 = i3 + 1;
                            cArr[i3] = 'O';
                            i3 += 2;
                            cArr[i117] = 'O';
                            break;
                        case 42831:
                            int i118 = i3 + 1;
                            cArr[i3] = 'o';
                            i3 += 2;
                            cArr[i118] = 'o';
                            break;
                        case 42848:
                            int i119 = i3 + 1;
                            cArr[i3] = 'V';
                            i3 += 2;
                            cArr[i119] = 'Y';
                            break;
                        case 42849:
                            int i120 = i3 + 1;
                            cArr[i3] = 'v';
                            i3 += 2;
                            cArr[i120] = 'y';
                            break;
                        case 42854:
                            int i121 = i3 + 1;
                            cArr[i3] = 'T';
                            i3 += 2;
                            cArr[i121] = 'H';
                            break;
                        case 64256:
                            int i122 = i3 + 1;
                            cArr[i3] = 'f';
                            i3 += 2;
                            cArr[i122] = 'f';
                            break;
                        case 64257:
                            int i123 = i3 + 1;
                            cArr[i3] = 'f';
                            i3 += 2;
                            cArr[i123] = 'i';
                            break;
                        case 64258:
                            int i124 = i3 + 1;
                            cArr[i3] = 'f';
                            i3 += 2;
                            cArr[i124] = 'l';
                            break;
                        case 64259:
                            cArr[i3] = 'f';
                            int i125 = i3 + 2;
                            cArr[i3 + 1] = 'f';
                            i3 += 3;
                            cArr[i125] = 'i';
                            break;
                        case 64260:
                            cArr[i3] = 'f';
                            int i126 = i3 + 2;
                            cArr[i3 + 1] = 'f';
                            i3 += 3;
                            cArr[i126] = 'l';
                            break;
                        case 64262:
                            int i127 = i3 + 1;
                            cArr[i3] = 's';
                            i3 += 2;
                            cArr[i127] = 't';
                            break;
                        case 65281:
                            i = i3 + 1;
                            cArr[i3] = '!';
                            i3 = i;
                            break;
                        case 65283:
                            i = i3 + 1;
                            cArr[i3] = '#';
                            i3 = i;
                            break;
                        case 65284:
                            i = i3 + 1;
                            cArr[i3] = '$';
                            i3 = i;
                            break;
                        case 65286:
                            i = i3 + 1;
                            cArr[i3] = '&';
                            i3 = i;
                            break;
                        case 65292:
                            i = i3 + 1;
                            cArr[i3] = ',';
                            i3 = i;
                            break;
                        case 65294:
                            i = i3 + 1;
                            cArr[i3] = '.';
                            i3 = i;
                            break;
                        case 65306:
                            i = i3 + 1;
                            cArr[i3] = ':';
                            i3 = i;
                            break;
                        case 65311:
                            i = i3 + 1;
                            cArr[i3] = '?';
                            i3 = i;
                            break;
                        case 65312:
                            i = i3 + 1;
                            cArr[i3] = '@';
                            i3 = i;
                            break;
                        case 65340:
                            i = i3 + 1;
                            cArr[i3] = '\\';
                            i3 = i;
                            break;
                        case 65343:
                            i = i3 + 1;
                            cArr[i3] = '_';
                            i3 = i;
                            break;
                        default:
                            switch (c2) {
                                case 434:
                                    i = i3 + 1;
                                    cArr[i3] = 'V';
                                    i3 = i;
                                    break;
                                case 435:
                                    i = i3 + 1;
                                    cArr[i3] = 'Y';
                                    i3 = i;
                                    break;
                                case 436:
                                    i = i3 + 1;
                                    cArr[i3] = 'y';
                                    i3 = i;
                                    break;
                                case 437:
                                    i = i3 + 1;
                                    cArr[i3] = 'Z';
                                    i3 = i;
                                    break;
                                case 438:
                                    i = i3 + 1;
                                    cArr[i3] = 'z';
                                    i3 = i;
                                    break;
                                default:
                                    switch (c2) {
                                        case 452:
                                            int i128 = i3 + 1;
                                            cArr[i3] = 'D';
                                            i3 += 2;
                                            cArr[i128] = 'Z';
                                            break;
                                        case 453:
                                            int i129 = i3 + 1;
                                            cArr[i3] = 'D';
                                            i3 += 2;
                                            cArr[i129] = 'z';
                                            break;
                                        case 454:
                                            int i130 = i3 + 1;
                                            cArr[i3] = 'd';
                                            i3 += 2;
                                            cArr[i130] = 'z';
                                            break;
                                        case 455:
                                            int i131 = i3 + 1;
                                            cArr[i3] = 'L';
                                            i3 += 2;
                                            cArr[i131] = 'J';
                                            break;
                                        case 456:
                                            int i132 = i3 + 1;
                                            cArr[i3] = 'L';
                                            i3 += 2;
                                            cArr[i132] = 'j';
                                            break;
                                        case 457:
                                            int i133 = i3 + 1;
                                            cArr[i3] = 'l';
                                            i3 += 2;
                                            cArr[i133] = 'j';
                                            break;
                                        case 458:
                                            int i134 = i3 + 1;
                                            cArr[i3] = 'N';
                                            i3 += 2;
                                            cArr[i134] = 'J';
                                            break;
                                        case 459:
                                            int i135 = i3 + 1;
                                            cArr[i3] = 'N';
                                            i3 += 2;
                                            cArr[i135] = 'j';
                                            break;
                                        case 460:
                                            int i136 = i3 + 1;
                                            cArr[i3] = 'n';
                                            i3 += 2;
                                            cArr[i136] = 'j';
                                            break;
                                        case 461:
                                        case 478:
                                        case 480:
                                            i = i3 + 1;
                                            cArr[i3] = 'A';
                                            i3 = i;
                                            break;
                                        case 462:
                                        case 479:
                                        case 481:
                                            i = i3 + 1;
                                            cArr[i3] = 'a';
                                            i3 = i;
                                            break;
                                        case 463:
                                            i = i3 + 1;
                                            cArr[i3] = 'I';
                                            i3 = i;
                                            break;
                                        case 464:
                                            i = i3 + 1;
                                            cArr[i3] = 'i';
                                            i3 = i;
                                            break;
                                        case 465:
                                        case 490:
                                        case 492:
                                            i = i3 + 1;
                                            cArr[i3] = 'O';
                                            i3 = i;
                                            break;
                                        case 466:
                                        case 491:
                                        case 493:
                                            i = i3 + 1;
                                            cArr[i3] = 'o';
                                            i3 = i;
                                            break;
                                        case 467:
                                        case 469:
                                        case 471:
                                        case 473:
                                        case 475:
                                            i = i3 + 1;
                                            cArr[i3] = 'U';
                                            i3 = i;
                                            break;
                                        case 468:
                                        case 470:
                                        case 472:
                                        case 474:
                                        case 476:
                                            i = i3 + 1;
                                            cArr[i3] = 'u';
                                            i3 = i;
                                            break;
                                        case 477:
                                            i = i3 + 1;
                                            cArr[i3] = 'e';
                                            i3 = i;
                                            break;
                                        case 482:
                                            int i137 = i3 + 1;
                                            cArr[i3] = 'A';
                                            i3 += 2;
                                            cArr[i137] = 'E';
                                            break;
                                        case 483:
                                            int i138 = i3 + 1;
                                            cArr[i3] = 'a';
                                            i3 += 2;
                                            cArr[i138] = 'e';
                                            break;
                                        case 484:
                                        case 485:
                                        case 486:
                                        case 487:
                                            i = i3 + 1;
                                            cArr[i3] = 'G';
                                            i3 = i;
                                            break;
                                        case 488:
                                            i = i3 + 1;
                                            cArr[i3] = 'K';
                                            i3 = i;
                                            break;
                                        case 489:
                                            i = i3 + 1;
                                            cArr[i3] = 'k';
                                            i3 = i;
                                            break;
                                        default:
                                            switch (c2) {
                                                case 496:
                                                case 567:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'j';
                                                    i3 = i;
                                                    break;
                                                case 497:
                                                    int i1210 = i3 + 1;
                                                    cArr[i3] = 'D';
                                                    i3 += 2;
                                                    cArr[i1210] = 'Z';
                                                    break;
                                                case 498:
                                                    int i1211 = i3 + 1;
                                                    cArr[i3] = 'D';
                                                    i3 += 2;
                                                    cArr[i1211] = 'z';
                                                    break;
                                                case 499:
                                                    int i139 = i3 + 1;
                                                    cArr[i3] = 'd';
                                                    i3 += 2;
                                                    cArr[i139] = 'z';
                                                    break;
                                                case 500:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'G';
                                                    i3 = i;
                                                    break;
                                                case HttpStatus.SC_NOT_IMPLEMENTED /* 501 */:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'g';
                                                    i3 = i;
                                                    break;
                                                case HttpStatus.SC_BAD_GATEWAY /* 502 */:
                                                    int i140 = i3 + 1;
                                                    cArr[i3] = 'H';
                                                    i3 += 2;
                                                    cArr[i140] = 'V';
                                                    break;
                                                case HttpStatus.SC_SERVICE_UNAVAILABLE /* 503 */:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'W';
                                                    i3 = i;
                                                    break;
                                                case HttpStatus.SC_GATEWAY_TIMEOUT /* 504 */:
                                                case 544:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'N';
                                                    i3 = i;
                                                    break;
                                                case HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED /* 505 */:
                                                case 565:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'n';
                                                    i3 = i;
                                                    break;
                                                case 506:
                                                case np0.o /* 512 */:
                                                case 514:
                                                case 550:
                                                case 570:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'A';
                                                    i3 = i;
                                                    break;
                                                case HttpStatus.SC_INSUFFICIENT_STORAGE /* 507 */:
                                                case 513:
                                                case 515:
                                                case 551:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'a';
                                                    i3 = i;
                                                    break;
                                                case 508:
                                                    int i1310 = i3 + 1;
                                                    cArr[i3] = 'A';
                                                    i3 += 2;
                                                    cArr[i1310] = 'E';
                                                    break;
                                                case 509:
                                                    int i1311 = i3 + 1;
                                                    cArr[i3] = 'a';
                                                    i3 += 2;
                                                    cArr[i1311] = 'e';
                                                    break;
                                                case 510:
                                                case 524:
                                                case 526:
                                                case 554:
                                                case 556:
                                                case 558:
                                                case 560:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'O';
                                                    i3 = i;
                                                    break;
                                                case 511:
                                                case 525:
                                                case 527:
                                                case 555:
                                                case 557:
                                                case 559:
                                                case 561:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'o';
                                                    i3 = i;
                                                    break;
                                                case 516:
                                                case 518:
                                                case 552:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'E';
                                                    i3 = i;
                                                    break;
                                                case 517:
                                                case 519:
                                                case 553:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'e';
                                                    i3 = i;
                                                    break;
                                                case 520:
                                                case 522:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'I';
                                                    i3 = i;
                                                    break;
                                                case 521:
                                                case 523:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'i';
                                                    i3 = i;
                                                    break;
                                                case 528:
                                                case 530:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'R';
                                                    i3 = i;
                                                    break;
                                                case 529:
                                                case 531:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'r';
                                                    i3 = i;
                                                    break;
                                                case 532:
                                                case 534:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'U';
                                                    i3 = i;
                                                    break;
                                                case 533:
                                                case 535:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'u';
                                                    i3 = i;
                                                    break;
                                                case 536:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'S';
                                                    i3 = i;
                                                    break;
                                                case 537:
                                                case 575:
                                                    i = i3 + 1;
                                                    cArr[i3] = 's';
                                                    i3 = i;
                                                    break;
                                                case 538:
                                                case 574:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'T';
                                                    i3 = i;
                                                    break;
                                                case 539:
                                                case 566:
                                                    i = i3 + 1;
                                                    cArr[i3] = 't';
                                                    i3 = i;
                                                    break;
                                                case 540:
                                                case 548:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'Z';
                                                    i3 = i;
                                                    break;
                                                case 541:
                                                case 549:
                                                case 576:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'z';
                                                    i3 = i;
                                                    break;
                                                case 542:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'H';
                                                    i3 = i;
                                                    break;
                                                case 543:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'h';
                                                    i3 = i;
                                                    break;
                                                case 545:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'd';
                                                    i3 = i;
                                                    break;
                                                case 546:
                                                    int i141 = i3 + 1;
                                                    cArr[i3] = 'O';
                                                    i3 += 2;
                                                    cArr[i141] = 'U';
                                                    break;
                                                case 547:
                                                    int i142 = i3 + 1;
                                                    cArr[i3] = 'o';
                                                    i3 += 2;
                                                    cArr[i142] = 'u';
                                                    break;
                                                case 562:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'Y';
                                                    i3 = i;
                                                    break;
                                                case 563:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'y';
                                                    i3 = i;
                                                    break;
                                                case 564:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'l';
                                                    i3 = i;
                                                    break;
                                                case 568:
                                                    int i143 = i3 + 1;
                                                    cArr[i3] = 'd';
                                                    i3 += 2;
                                                    cArr[i143] = 'b';
                                                    break;
                                                case 569:
                                                    int i144 = i3 + 1;
                                                    cArr[i3] = 'q';
                                                    i3 += 2;
                                                    cArr[i144] = 'p';
                                                    break;
                                                case 571:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'C';
                                                    i3 = i;
                                                    break;
                                                case 572:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'c';
                                                    i3 = i;
                                                    break;
                                                case 573:
                                                    i = i3 + 1;
                                                    cArr[i3] = 'L';
                                                    i3 = i;
                                                    break;
                                                default:
                                                    switch (c2) {
                                                        case 579:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'B';
                                                            i3 = i;
                                                            break;
                                                        case 580:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'U';
                                                            i3 = i;
                                                            break;
                                                        case 581:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'V';
                                                            i3 = i;
                                                            break;
                                                        case 582:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'E';
                                                            i3 = i;
                                                            break;
                                                        case 583:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'e';
                                                            i3 = i;
                                                            break;
                                                        case 584:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'J';
                                                            i3 = i;
                                                            break;
                                                        case 585:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'j';
                                                            i3 = i;
                                                            break;
                                                        case 586:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'Q';
                                                            i3 = i;
                                                            break;
                                                        case 587:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'q';
                                                            i3 = i;
                                                            break;
                                                        case 588:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'R';
                                                            i3 = i;
                                                            break;
                                                        case 589:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'r';
                                                            i3 = i;
                                                            break;
                                                        case 590:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'Y';
                                                            i3 = i;
                                                            break;
                                                        case 591:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'y';
                                                            i3 = i;
                                                            break;
                                                        case 592:
                                                            i = i3 + 1;
                                                            cArr[i3] = 'a';
                                                            i3 = i;
                                                            break;
                                                        default:
                                                            switch (c2) {
                                                                case 595:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'b';
                                                                    i3 = i;
                                                                    break;
                                                                case 596:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'o';
                                                                    i3 = i;
                                                                    break;
                                                                case 597:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'c';
                                                                    i3 = i;
                                                                    break;
                                                                case 598:
                                                                case 599:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'd';
                                                                    i3 = i;
                                                                    break;
                                                                case 600:
                                                                case 603:
                                                                case 604:
                                                                case 605:
                                                                case 606:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'e';
                                                                    i3 = i;
                                                                    break;
                                                                case 601:
                                                                case 602:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'a';
                                                                    i3 = i;
                                                                    break;
                                                                case 607:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'j';
                                                                    i3 = i;
                                                                    break;
                                                                case 608:
                                                                case 609:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'g';
                                                                    i3 = i;
                                                                    break;
                                                                case 610:
                                                                    i = i3 + 1;
                                                                    cArr[i3] = 'G';
                                                                    i3 = i;
                                                                    break;
                                                                default:
                                                                    switch (c2) {
                                                                        case 618:
                                                                            i = i3 + 1;
                                                                            cArr[i3] = 'I';
                                                                            i3 = i;
                                                                            break;
                                                                        case 619:
                                                                        case 620:
                                                                        case 621:
                                                                            i = i3 + 1;
                                                                            cArr[i3] = 'l';
                                                                            i3 = i;
                                                                            break;
                                                                        default:
                                                                            switch (c2) {
                                                                                case 623:
                                                                                case 624:
                                                                                case 625:
                                                                                    i = i3 + 1;
                                                                                    cArr[i3] = 'm';
                                                                                    i3 = i;
                                                                                    break;
                                                                                case 626:
                                                                                case 627:
                                                                                    i = i3 + 1;
                                                                                    cArr[i3] = 'n';
                                                                                    i3 = i;
                                                                                    break;
                                                                                case 628:
                                                                                    i = i3 + 1;
                                                                                    cArr[i3] = 'N';
                                                                                    i3 = i;
                                                                                    break;
                                                                                case 629:
                                                                                    i = i3 + 1;
                                                                                    cArr[i3] = 'o';
                                                                                    i3 = i;
                                                                                    break;
                                                                                case 630:
                                                                                    int i145 = i3 + 1;
                                                                                    cArr[i3] = 'O';
                                                                                    i3 += 2;
                                                                                    cArr[i145] = 'E';
                                                                                    break;
                                                                                default:
                                                                                    switch (c2) {
                                                                                        case 636:
                                                                                        case 637:
                                                                                        case 638:
                                                                                        case 639:
                                                                                            i = i3 + 1;
                                                                                            cArr[i3] = 'r';
                                                                                            i3 = i;
                                                                                            break;
                                                                                        case 640:
                                                                                        case 641:
                                                                                            i = i3 + 1;
                                                                                            cArr[i3] = 'R';
                                                                                            i3 = i;
                                                                                            break;
                                                                                        case 642:
                                                                                            i = i3 + 1;
                                                                                            cArr[i3] = 's';
                                                                                            i3 = i;
                                                                                            break;
                                                                                        default:
                                                                                            switch (c2) {
                                                                                                case 192:
                                                                                                case 193:
                                                                                                case 194:
                                                                                                case 195:
                                                                                                case 196:
                                                                                                case 197:
                                                                                                    i = i3 + 1;
                                                                                                    cArr[i3] = 'A';
                                                                                                    i3 = i;
                                                                                                    break;
                                                                                                case 198:
                                                                                                    int i1312 = i3 + 1;
                                                                                                    cArr[i3] = 'A';
                                                                                                    i3 += 2;
                                                                                                    cArr[i1312] = 'E';
                                                                                                    break;
                                                                                                case 199:
                                                                                                    i = i3 + 1;
                                                                                                    cArr[i3] = 'C';
                                                                                                    i3 = i;
                                                                                                    break;
                                                                                                case 200:
                                                                                                case 201:
                                                                                                case 202:
                                                                                                case 203:
                                                                                                    i = i3 + 1;
                                                                                                    cArr[i3] = 'E';
                                                                                                    i3 = i;
                                                                                                    break;
                                                                                                case 204:
                                                                                                case 205:
                                                                                                case 206:
                                                                                                case 207:
                                                                                                    i = i3 + 1;
                                                                                                    cArr[i3] = 'I';
                                                                                                    i3 = i;
                                                                                                    break;
                                                                                                case 208:
                                                                                                    i = i3 + 1;
                                                                                                    cArr[i3] = 'D';
                                                                                                    i3 = i;
                                                                                                    break;
                                                                                                case 209:
                                                                                                    i = i3 + 1;
                                                                                                    cArr[i3] = 'N';
                                                                                                    i3 = i;
                                                                                                    break;
                                                                                                case 210:
                                                                                                case 211:
                                                                                                case 212:
                                                                                                case 213:
                                                                                                case 214:
                                                                                                    i = i3 + 1;
                                                                                                    cArr[i3] = 'O';
                                                                                                    i3 = i;
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (c2) {
                                                                                                        case 216:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'O';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 217:
                                                                                                        case 218:
                                                                                                        case 219:
                                                                                                        case 220:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'U';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 221:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'Y';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 222:
                                                                                                            int i1212 = i3 + 1;
                                                                                                            cArr[i3] = 'T';
                                                                                                            i3 += 2;
                                                                                                            cArr[i1212] = 'H';
                                                                                                            break;
                                                                                                        case 223:
                                                                                                            int i146 = i3 + 1;
                                                                                                            cArr[i3] = 's';
                                                                                                            i3 += 2;
                                                                                                            cArr[i146] = 's';
                                                                                                            break;
                                                                                                        case 224:
                                                                                                        case 225:
                                                                                                        case 226:
                                                                                                        case 227:
                                                                                                        case 228:
                                                                                                        case 229:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'a';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 230:
                                                                                                            int i1313 = i3 + 1;
                                                                                                            cArr[i3] = 'a';
                                                                                                            i3 += 2;
                                                                                                            cArr[i1313] = 'e';
                                                                                                            break;
                                                                                                        case 231:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'c';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 232:
                                                                                                        case 233:
                                                                                                        case 234:
                                                                                                        case 235:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'e';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 236:
                                                                                                        case 237:
                                                                                                        case 238:
                                                                                                        case 239:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'i';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 240:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'd';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 241:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'n';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        case 242:
                                                                                                        case 243:
                                                                                                        case 244:
                                                                                                        case 245:
                                                                                                        case 246:
                                                                                                            i = i3 + 1;
                                                                                                            cArr[i3] = 'o';
                                                                                                            i3 = i;
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (c2) {
                                                                                                                case 390:
                                                                                                                    i = i3 + 1;
                                                                                                                    cArr[i3] = 'O';
                                                                                                                    i3 = i;
                                                                                                                    break;
                                                                                                                case 391:
                                                                                                                    i = i3 + 1;
                                                                                                                    cArr[i3] = 'C';
                                                                                                                    i3 = i;
                                                                                                                    break;
                                                                                                                case 392:
                                                                                                                    i = i3 + 1;
                                                                                                                    cArr[i3] = 'c';
                                                                                                                    i3 = i;
                                                                                                                    break;
                                                                                                                case 393:
                                                                                                                case 394:
                                                                                                                case 395:
                                                                                                                    i = i3 + 1;
                                                                                                                    cArr[i3] = 'D';
                                                                                                                    i3 = i;
                                                                                                                    break;
                                                                                                                case 396:
                                                                                                                    i = i3 + 1;
                                                                                                                    cArr[i3] = 'd';
                                                                                                                    i3 = i;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (c2) {
                                                                                                                        case 398:
                                                                                                                        case HttpStatus.SC_BAD_REQUEST /* 400 */:
                                                                                                                            i = i3 + 1;
                                                                                                                            cArr[i3] = 'E';
                                                                                                                            i3 = i;
                                                                                                                            break;
                                                                                                                        case 399:
                                                                                                                            i = i3 + 1;
                                                                                                                            cArr[i3] = 'A';
                                                                                                                            i3 = i;
                                                                                                                            break;
                                                                                                                        case HttpStatus.SC_UNAUTHORIZED /* 401 */:
                                                                                                                            i = i3 + 1;
                                                                                                                            cArr[i3] = 'F';
                                                                                                                            i3 = i;
                                                                                                                            break;
                                                                                                                        case HttpStatus.SC_PAYMENT_REQUIRED /* 402 */:
                                                                                                                            i = i3 + 1;
                                                                                                                            cArr[i3] = 'f';
                                                                                                                            i3 = i;
                                                                                                                            break;
                                                                                                                        case HttpStatus.SC_FORBIDDEN /* 403 */:
                                                                                                                            i = i3 + 1;
                                                                                                                            cArr[i3] = 'G';
                                                                                                                            i3 = i;
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (c2) {
                                                                                                                                case HttpStatus.SC_METHOD_NOT_ALLOWED /* 405 */:
                                                                                                                                    int i147 = i3 + 1;
                                                                                                                                    cArr[i3] = 'h';
                                                                                                                                    i3 += 2;
                                                                                                                                    cArr[i147] = 'v';
                                                                                                                                    break;
                                                                                                                                case HttpStatus.SC_NOT_ACCEPTABLE /* 406 */:
                                                                                                                                case HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED /* 407 */:
                                                                                                                                    i = i3 + 1;
                                                                                                                                    cArr[i3] = 'I';
                                                                                                                                    i3 = i;
                                                                                                                                    break;
                                                                                                                                case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                                                                                                                                    i = i3 + 1;
                                                                                                                                    cArr[i3] = 'K';
                                                                                                                                    i3 = i;
                                                                                                                                    break;
                                                                                                                                case HttpStatus.SC_CONFLICT /* 409 */:
                                                                                                                                    i = i3 + 1;
                                                                                                                                    cArr[i3] = 'k';
                                                                                                                                    i3 = i;
                                                                                                                                    break;
                                                                                                                                case HttpStatus.SC_GONE /* 410 */:
                                                                                                                                    i = i3 + 1;
                                                                                                                                    cArr[i3] = 'l';
                                                                                                                                    i3 = i;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (c2) {
                                                                                                                                        case HttpStatus.SC_PRECONDITION_FAILED /* 412 */:
                                                                                                                                            i = i3 + 1;
                                                                                                                                            cArr[i3] = 'M';
                                                                                                                                            i3 = i;
                                                                                                                                            break;
                                                                                                                                        case HttpStatus.SC_REQUEST_TOO_LONG /* 413 */:
                                                                                                                                            i = i3 + 1;
                                                                                                                                            cArr[i3] = 'N';
                                                                                                                                            i3 = i;
                                                                                                                                            break;
                                                                                                                                        case HttpStatus.SC_REQUEST_URI_TOO_LONG /* 414 */:
                                                                                                                                            i = i3 + 1;
                                                                                                                                            cArr[i3] = 'n';
                                                                                                                                            i3 = i;
                                                                                                                                            break;
                                                                                                                                        case HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE /* 415 */:
                                                                                                                                        case HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                                                                                                                                            i = i3 + 1;
                                                                                                                                            cArr[i3] = 'O';
                                                                                                                                            i3 = i;
                                                                                                                                            break;
                                                                                                                                        case HttpStatus.SC_EXPECTATION_FAILED /* 417 */:
                                                                                                                                            i = i3 + 1;
                                                                                                                                            cArr[i3] = 'o';
                                                                                                                                            i3 = i;
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (c2) {
                                                                                                                                                case 427:
                                                                                                                                                case 429:
                                                                                                                                                    i = i3 + 1;
                                                                                                                                                    cArr[i3] = 't';
                                                                                                                                                    i3 = i;
                                                                                                                                                    break;
                                                                                                                                                case 428:
                                                                                                                                                case 430:
                                                                                                                                                    i = i3 + 1;
                                                                                                                                                    cArr[i3] = 'T';
                                                                                                                                                    i3 = i;
                                                                                                                                                    break;
                                                                                                                                                case 431:
                                                                                                                                                    i = i3 + 1;
                                                                                                                                                    cArr[i3] = 'U';
                                                                                                                                                    i3 = i;
                                                                                                                                                    break;
                                                                                                                                                case 432:
                                                                                                                                                    i = i3 + 1;
                                                                                                                                                    cArr[i3] = 'u';
                                                                                                                                                    i3 = i;
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    i2 = i3 + 1;
                                                                                                                                                    cArr[i3] = c2;
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    i = i3 + 1;
                    cArr[i3] = 'h';
                    i3 = i;
                }
            }
            i3 = i2;
        }
        return new String(cArr, 0, i3);
    }

    public static final f67 C(Set set) {
        f67 f67Var = new f67(1);
        Iterator it = set.iterator();
        int size = set.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((s37) it.next()).a;
        }
        f67Var.b = iArr;
        return f67Var;
    }

    public static igh D(String str) throws JSONException {
        long j;
        Set setE;
        String string;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray jSONArrayNames = jSONObject2.names();
        int length = jSONArrayNames != null ? jSONArrayNames.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArrayNames != null && (string = jSONArrayNames.getString(i)) != null) {
                linkedHashMap.put(string, jSONObject2.getString(string));
            }
        }
        String str2 = "versionName";
        String string2 = jSONObject.getString("versionName");
        long j2 = jSONObject.getLong("versionCode");
        String strOptString = jSONObject.optString("packageName");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        if (strOptString == null) {
            strOptString = mvl.a();
        }
        String strOptString2 = jSONObject.optString("environment");
        if (strOptString2.length() <= 0) {
            strOptString2 = null;
        }
        String strOptString3 = jSONObject.optString("buildUuid");
        if (strOptString3.length() <= 0) {
            strOptString3 = null;
        }
        String strOptString4 = jSONObject.optString("sessionUuid");
        if (strOptString4.length() <= 0) {
            strOptString4 = null;
        }
        if (strOptString4 == null) {
            strOptString4 = UUID.randomUUID().toString();
        }
        String string3 = jSONObject.getString("device");
        String string4 = jSONObject.getString(ApiProtocol.PARAM_DEVICE_ID);
        String string5 = jSONObject.getString("vendor");
        String string6 = jSONObject.getString("osVersion");
        boolean z = jSONObject.getBoolean("inBackground");
        String strOptString5 = jSONObject.optString("connection");
        String str3 = strOptString5.length() > 0 ? strOptString5 : null;
        boolean z2 = jSONObject.getBoolean("isRooted");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("hostedLibrariesInfo");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            j = j2;
            setE = c76.a;
        } else {
            gof gofVar = new gof();
            int length2 = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (i2 < length2) {
                int i3 = length2;
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                String string7 = jSONObject3.getString("packageName");
                int i4 = i2;
                String string8 = jSONObject3.getString(str2);
                String strOptString6 = jSONObject3.optString("buildUuid");
                String str4 = strOptString6.length() > 0 ? strOptString6 : null;
                String strOptString7 = jSONObject3.optString("environment");
                if (strOptString7.length() <= 0) {
                    strOptString7 = null;
                }
                long j3 = j2;
                gofVar.add(new c08(string7, string8, str4, strOptString7));
                i2 = i4 + 1;
                length2 = i3;
                jSONArrayOptJSONArray = jSONArray;
                str2 = str2;
                j2 = j3;
            }
            j = j2;
            setE = p90.e(gofVar);
        }
        return new igh(string2, j, strOptString, strOptString2, strOptString3, strOptString4, string3, string4, string5, string6, z, str3, z2, linkedHashMap, setE);
    }

    public static final EnumSet E(f67 f67Var) {
        Object next;
        int[] iArr = (int[]) f67Var.b;
        EnumSet enumSetNoneOf = EnumSet.noneOf(s37.class);
        for (int i : iArr) {
            y1 y1Var = new y1(0, s37.h);
            do {
                if (!y1Var.hasNext()) {
                    next = null;
                    break;
                }
                next = y1Var.next();
            } while (((s37) next).a != i);
            s37 s37Var = (s37) next;
            if (s37Var == null) {
                ore.k(nbh.q(i, "unsupported type "));
                return null;
            }
            enumSetNoneOf.add(s37Var);
        }
        return enumSetNoneOf;
    }

    public static final wyg E0(azg azgVar) {
        ezg ezgVar;
        if (azgVar instanceof zyg) {
            ezgVar = ezg.USER;
        } else if (azgVar instanceof yyg) {
            ezgVar = ezg.CHAT;
        } else {
            if (!(azgVar instanceof xyg)) {
                ore.o();
                return null;
            }
            ezgVar = ezg.CHANNEL;
        }
        return new wyg(azgVar.a(), ezgVar);
    }

    public static Application F() {
        Application application = ApplicationProvider.a;
        if (application != null) {
            return application;
        }
        ore.k("Required value was null.");
        return null;
    }

    public static JSONObject F0(igh ighVar) throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", ighVar.a);
        jSONObject.put("versionCode", ighVar.b);
        jSONObject.put("packageName", ighVar.c);
        jSONObject.put("environment", ighVar.d);
        jSONObject.put("buildUuid", ighVar.e);
        jSONObject.put("sessionUuid", ighVar.f);
        jSONObject.put("device", ighVar.g);
        jSONObject.put(ApiProtocol.PARAM_DEVICE_ID, ighVar.h);
        jSONObject.put("vendor", ighVar.i);
        jSONObject.put("osVersion", ighVar.j);
        jSONObject.put("inBackground", ighVar.k);
        jSONObject.put("connection", ighVar.l);
        jSONObject.put("isRooted", ighVar.m);
        jSONObject.put("properties", new JSONObject(ighVar.n));
        Set<c08> set = ighVar.o;
        if (set == null || set.isEmpty()) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            for (c08 c08Var : set) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", c08Var.a);
                jSONObject2.put("versionName", c08Var.b);
                jSONObject2.put("buildUuid", c08Var.c);
                jSONObject2.put("environment", c08Var.d);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("hostedLibrariesInfo", jSONArray);
        return jSONObject;
    }

    public static final String G(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return "NONE";
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return "UNKNOWN";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "WIFI";
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ETHERNET";
        }
        if (networkCapabilities.hasTransport(2)) {
            return "BLUETOOTH";
        }
        if (networkCapabilities.hasTransport(4)) {
            return "VPN";
        }
        if (!networkCapabilities.hasTransport(0)) {
            return "UNKNOWN";
        }
        if (Build.VERSION.SDK_INT < 30) {
            return "CELLULAR";
        }
        String[] strArr = {"android.permission.READ_PHONE_STATE", "android.permission.READ_BASIC_PHONE_STATE"};
        for (int i = 0; i < 2; i++) {
            if (context.checkSelfPermission(strArr[i]) == 0) {
                switch (((TelephonyManager) context.getSystemService("phone")).getDataNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return "2G";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return "3G";
                    case 13:
                        return "4G";
                    case 18:
                        return "WIFI";
                    case 19:
                    default:
                        return "CELLULAR";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        return "5G";
                }
            }
        }
        return "CELLULAR";
    }

    public static final azg G0(wyg wygVar) {
        long j = wygVar.a;
        int i = qm9.$EnumSwitchMapping$1[wygVar.b.ordinal()];
        if (i == 1) {
            return new zyg(j);
        }
        if (i == 2) {
            return new yyg(j);
        }
        if (i == 3) {
            return new xyg(j);
        }
        ore.o();
        return null;
    }

    public static final void H0(View view, cf7 cf7Var) {
        if (view.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            cf7Var.invoke(marginLayoutParams);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final String I(Context context) {
        String str = c;
        if (str != null) {
            return str;
        }
        synchronized (b) {
            String str2 = c;
            if (str2 != null) {
                return str2;
            }
            String strL0 = l0(context.getApplicationContext());
            c = strL0;
            return strL0;
        }
    }

    public static final void I0(gdi gdiVar) {
        gdiVar.d(84, new ko7(0));
        gdiVar.d(93, new ko7(1));
        gdiVar.d(96, new ko7(2));
        gdiVar.d(83, new mu2(24));
        gdiVar.d(95, new mu2(25));
    }

    public static final int J(View view) {
        return g0(view) ? view.getLeft() : view.getRight();
    }

    public static final void J0(gdi gdiVar) {
        gdiVar.d(789, new kdj(7));
        gdiVar.d(790, new kdj(8));
        gdiVar.d(791, new kdj(9));
        gdiVar.d(792, new kdj(10));
        gdiVar.d(793, new kdj(11));
        gdiVar.d(794, new ldj(7));
        gdiVar.d(795, new ldj(8));
        gdiVar.d(796, new ldj(9));
        gdiVar.d(797, new ldj(10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object K0(vt4 vt4Var, qf7 qf7Var, lq4 lq4Var) {
        vt4 context = lq4Var.getContext();
        vt4 vt4VarU0 = !((Boolean) vt4Var.E(Boolean.FALSE, new dz(5))).booleanValue() ? context.u0(vt4Var) : n1g.w(context, vt4Var, false);
        vd7.q(vt4VarU0);
        if (vt4VarU0 == context) {
            s3f s3fVar = new s3f(lq4Var, vt4VarU0);
            return f55.x(s3fVar, true, s3fVar, qf7Var);
        }
        khb khbVar = khb.f;
        if (cqk.d(vt4VarU0.x0(khbVar), context.x0(khbVar))) {
            zai zaiVar = new zai(lq4Var, vt4VarU0);
            vt4 vt4Var2 = zaiVar.e;
            Object objI = np4.I(vt4Var2, null);
            try {
                return f55.x(zaiVar, true, zaiVar, qf7Var);
            } finally {
                np4.A(vt4Var2, objI);
            }
        }
        tn5 tn5Var = new tn5(lq4Var, vt4VarU0);
        try {
            e9i.w0(p90.B(((mq0) qf7Var).create(tn5Var, tn5Var)), sbi.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = tn5.g;
            do {
                int i = atomicIntegerFieldUpdater.get(tn5Var);
                if (i != 0) {
                    if (i != 2) {
                        ore.k("Already suspended");
                        return null;
                    }
                    Object objM0 = rx8.m0(tn5Var.J());
                    if (objM0 instanceof s64) {
                        throw ((s64) objM0).a;
                    }
                    return objM0;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(tn5Var, 0, 1));
            return hu4.a;
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).a;
            }
            tn5Var.resumeWith(new poe(th));
            throw th;
        }
    }

    public static final ViewGroup L(View view) {
        ViewGroup viewGroupL;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (viewGroupL = L(viewGroup)) != null) {
            return viewGroupL;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static p9 M(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, tp2 tp2Var, Bundle bundle, AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl2) {
        Map map = androidXLifecycleHandlerImpl.getU1().j;
        LinkedHashMap linkedHashMap = b19.a;
        p9 p9Var = (p9) map.get(Integer.valueOf(tp2Var.getId()));
        if (p9Var != null) {
            p9Var.b0(androidXLifecycleHandlerImpl2, tp2Var);
            return p9Var;
        }
        p9 p9Var2 = new p9();
        p9Var2.b0(androidXLifecycleHandlerImpl2, tp2Var);
        if (bundle != null) {
            StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
            ViewGroup viewGroup = p9Var2.i;
            sb.append(viewGroup != null ? viewGroup.getId() : 0);
            Bundle bundle2 = bundle.getBundle(sb.toString());
            if (bundle2 != null) {
                p9Var2.P(bundle2);
            }
        }
        androidXLifecycleHandlerImpl.getU1().j.put(Integer.valueOf(tp2Var.getId()), p9Var2);
        return p9Var2;
    }

    public static List N(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl) {
        return ww3.T1(androidXLifecycleHandlerImpl.getU1().j.values());
    }

    public static final SavedStateHandlesVM O(i8j i8jVar) {
        b8j b8jVarA;
        ki3 ki3Var = new ki3(i8jVar.b(), new x0f(), i8jVar instanceof rt7 ? ((rt7) i8jVar).e() : zv4.c);
        sr3 sr3VarA = zfe.a(SavedStateHandlesVM.class);
        f8j f8jVar = (f8j) ki3Var.b;
        h8j h8jVar = (h8j) ki3Var.a;
        b8j b8jVar = (b8j) h8jVar.a.get("androidx.lifecycle.internal.SavedStateHandlesVM");
        if (!sr3VarA.i(b8jVar)) {
            x7b x7bVar = new x7b((f83) ki3Var.c);
            x7bVar.o(khb.n, "androidx.lifecycle.internal.SavedStateHandlesVM");
            try {
                try {
                    b8jVarA = f8jVar.c(sr3VarA, x7bVar);
                } catch (AbstractMethodError unused) {
                    b8jVarA = f8jVar.a(sr3VarA.d());
                }
            } catch (AbstractMethodError unused2) {
                b8jVarA = f8jVar.b(sr3VarA.d(), x7bVar);
            }
            b8jVar = b8jVarA;
            b8j b8jVar2 = (b8j) h8jVar.a.put("androidx.lifecycle.internal.SavedStateHandlesVM", b8jVar);
            if (b8jVar2 != null) {
                b8jVar2.a();
            }
        } else if (f8jVar instanceof d1f) {
            ((d1f) f8jVar).e(b8jVar);
        }
        return (SavedStateHandlesVM) b8jVar;
    }

    public static final int P(View view) {
        return g0(view) ? view.getRight() : view.getLeft();
    }

    public static int Q() throws PackageManager.NameNotFoundException {
        Integer num = ApplicationProvider.b;
        if (num != null) {
            return num.intValue();
        }
        PackageInfo packageInfo = F().getPackageManager().getPackageInfo(F().getPackageName(), 0);
        int i = packageInfo.versionCode;
        ApplicationProvider.b = Integer.valueOf(i);
        if (ApplicationProvider.c == null) {
            ApplicationProvider.c = packageInfo.versionName;
        }
        return i;
    }

    public static String R() {
        String str = ApplicationProvider.c;
        if (str != null) {
            return str;
        }
        PackageInfo packageInfoE = luk.e(F());
        String str2 = packageInfoE.versionName;
        ApplicationProvider.c = str2;
        if (ApplicationProvider.b == null) {
            ApplicationProvider.b = Integer.valueOf(packageInfoE.versionCode);
        }
        return str2 == null ? "" : str2;
    }

    public static void S(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, int i, int i2, Intent intent) {
        String str = (String) androidXLifecycleHandlerImpl.getU1().h.get(i);
        if (str != null) {
            Iterator it = N(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                br4 br4VarF = ((p9) it.next()).f(str);
                if (br4VarF != null) {
                    br4VarF.onActivityResult(i, i2, intent);
                }
            }
        }
    }

    public static void T(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Context context) {
        if (context instanceof Activity) {
            androidXLifecycleHandlerImpl.getU1().b = (Activity) context;
        }
        androidXLifecycleHandlerImpl.getU1().d = false;
        if (androidXLifecycleHandlerImpl.getU1().e) {
            return;
        }
        androidXLifecycleHandlerImpl.getU1().e = true;
        int size = androidXLifecycleHandlerImpl.getU1().i.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                eqc eqcVar = (eqc) androidXLifecycleHandlerImpl.getU1().i.remove(size);
                a0(androidXLifecycleHandlerImpl, eqcVar.a(), eqcVar.b(), eqcVar.c());
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        Iterator it = N(androidXLifecycleHandlerImpl).iterator();
        while (it.hasNext()) {
            ((p9) it.next()).v();
        }
    }

    public static void U(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Bundle bundle) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (bundle == null) {
            return;
        }
        a19 u1 = androidXLifecycleHandlerImpl.getU1();
        o5h o5hVar = (o5h) bundle.getParcelable("LifecycleHandler.permissionRequests");
        if (o5hVar == null || (sparseArray = o5hVar.a()) == null) {
            sparseArray = new SparseArray();
        }
        u1.g = sparseArray;
        a19 u2 = androidXLifecycleHandlerImpl.getU1();
        o5h o5hVar2 = (o5h) bundle.getParcelable("LifecycleHandler.activityRequests");
        if (o5hVar2 == null || (sparseArray2 = o5hVar2.a()) == null) {
            sparseArray2 = new SparseArray();
        }
        u2.h = sparseArray2;
        a19 u3 = androidXLifecycleHandlerImpl.getU1();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        u3.i = parcelableArrayList;
    }

    public static void V(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl) {
        Activity activity = androidXLifecycleHandlerImpl.getU1().b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(androidXLifecycleHandlerImpl);
            b19.a.remove(activity);
            y(androidXLifecycleHandlerImpl, false);
            androidXLifecycleHandlerImpl.getU1().b = null;
        }
        androidXLifecycleHandlerImpl.getU1().j.clear();
    }

    public static boolean W(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, MenuItem menuItem, af7 af7Var) {
        List listN = N(androidXLifecycleHandlerImpl);
        if (!(listN instanceof Collection) || !listN.isEmpty()) {
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                if (((p9) it.next()).x(menuItem)) {
                    return true;
                }
            }
        }
        return ((Boolean) af7Var.invoke()).booleanValue();
    }

    public static void X(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, int i, String[] strArr, int[] iArr) {
        String str = (String) androidXLifecycleHandlerImpl.getU1().g.get(i);
        if (str != null) {
            Iterator it = N(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                br4 br4VarF = ((p9) it.next()).f(str);
                if (br4VarF != null) {
                    br4VarF.requestPermissionsResult(i, strArr, iArr);
                }
            }
        }
    }

    public static void Y(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Bundle bundle) {
        bundle.putParcelable("LifecycleHandler.permissionRequests", new o5h(androidXLifecycleHandlerImpl.getU1().g));
        bundle.putParcelable("LifecycleHandler.activityRequests", new o5h(androidXLifecycleHandlerImpl.getU1().h));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", androidXLifecycleHandlerImpl.getU1().i);
    }

    public static void Z(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Activity activity, AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl2) {
        androidXLifecycleHandlerImpl.getU1().b = activity;
        if (androidXLifecycleHandlerImpl.getU1().c) {
            return;
        }
        androidXLifecycleHandlerImpl.getU1().c = true;
        activity.getApplication().registerActivityLifecycleCallbacks(androidXLifecycleHandlerImpl);
        b19.a.put(activity, androidXLifecycleHandlerImpl2);
    }

    public static final p41 a(int i, int i2, cf7 cf7Var) {
        if (i == -2) {
            if (i2 != 1) {
                return new uc4(1, i2, cf7Var);
            }
            hr2.V.getClass();
            return new p41(gr2.b, cf7Var);
        }
        if (i == -1) {
            if (i2 == 1) {
                return new uc4(1, 2, cf7Var);
            }
            ore.p("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return i2 == 1 ? new p41(0, cf7Var) : new uc4(1, i2, cf7Var);
        }
        if (i != Integer.MAX_VALUE) {
            return i2 == 1 ? new p41(i, cf7Var) : new uc4(i, i2, cf7Var);
        }
        return new p41(Integer.MAX_VALUE, cf7Var);
    }

    public static void a0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, String str, String[] strArr, int i) {
        if (!androidXLifecycleHandlerImpl.getU1().e) {
            androidXLifecycleHandlerImpl.getU1().i.add(new eqc(str, strArr, i));
            return;
        }
        androidXLifecycleHandlerImpl.getU1().g.put(i, str);
        if (androidXLifecycleHandlerImpl.u == null) {
            ore.k(zo5.n("Fragment ", androidXLifecycleHandlerImpl, " not attached to Activity"));
            return;
        }
        c cVarL = androidXLifecycleHandlerImpl.l();
        if (cVarL.D == null) {
            cVarL.v.getClass();
            return;
        }
        cVarL.E.addLast(new db7(androidXLifecycleHandlerImpl.e, i));
        cVarL.D.n(strArr);
    }

    public static /* synthetic */ p41 b(int i, int i2, cf7 cf7Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            cf7Var = null;
        }
        return a(i, i2, cf7Var);
    }

    public static void b0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, String str) {
        int size = androidXLifecycleHandlerImpl.getU1().h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (str.equals(androidXLifecycleHandlerImpl.getU1().h.get(androidXLifecycleHandlerImpl.getU1().h.keyAt(size)))) {
                androidXLifecycleHandlerImpl.getU1().h.removeAt(size);
            }
        }
    }

    public static final thd c(String str, rhd rhdVar) {
        if (!r5h.X0(str)) {
            return uhd.a(str, rhdVar);
        }
        ore.p("Blank serial names are prohibited");
        return null;
    }

    public static final Float c0(Float f2) {
        if (f2 == null || f2.floatValue() <= 0.0f) {
            return null;
        }
        return f2;
    }

    public static final void d(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (view.getParent() == null) {
            viewGroup.addView(view, layoutParams);
        }
    }

    public static void d0(zab zabVar) {
        boolean z;
        synchronized (yab.class) {
            z = a != null;
        }
        if (z) {
            return;
        }
        synchronized (yab.class) {
            try {
                if (a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                a = zabVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void e(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static final boolean f0(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.PRODUCT;
        boolean z = "sdk".equals(str) || "google_sdk".equals(str) || string == null;
        String str2 = Build.TAGS;
        if ((z || str2 == null || !r5h.L0(str2, "test-keys", false)) && !new File("/system/app/Superuser.apk").exists()) {
            File file = new File("/system/xbin/su");
            if (z || !file.exists()) {
                return false;
            }
        }
        return true;
    }

    public static final yf5 g(gu4 gu4Var, vt4 vt4Var, int i, qf7 qf7Var) {
        vt4 vt4VarM = n1g.M(gu4Var, vt4Var);
        yf5 py8Var = i == 2 ? new py8(vt4VarM, qf7Var) : new yf5(vt4VarM, true);
        py8Var.m0(i, py8Var, qf7Var);
        return py8Var;
    }

    public static final boolean g0(View view) {
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static /* synthetic */ yf5 h(gu4 gu4Var, vt4 vt4Var, int i, qf7 qf7Var, int i2) {
        if ((i2 & 1) != 0) {
            vt4Var = k66.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return g(gu4Var, vt4Var, i, qf7Var);
    }

    public static final sgg h0(gu4 gu4Var, vt4 vt4Var, int i, qf7 qf7Var) {
        vt4 vt4VarM = n1g.M(gu4Var, vt4Var);
        sgg wy8Var = i == 2 ? new wy8(vt4VarM, qf7Var) : new sgg(vt4VarM, true);
        wy8Var.m0(i, wy8Var, qf7Var);
        return wy8Var;
    }

    public static final void i(StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(ww3.z1(arrayList, ",", null, null, null, 62));
    }

    public static /* synthetic */ sgg i0(gu4 gu4Var, vt4 vt4Var, int i, qf7 qf7Var, int i2) {
        if ((i2 & 1) != 0) {
            vt4Var = k66.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return h0(gu4Var, vt4Var, i, qf7Var);
    }

    public static c79 j(List list) {
        c79 c79Var = (c79) list;
        c79Var.f();
        c79Var.c = true;
        return c79Var.b > 0 ? c79Var : c79.d;
    }

    public static final void j0(int i, int i2, int i3, int i4, View view, View view2) {
        if (g0(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static final hif k(String str, fif[] fifVarArr, cf7 cf7Var) {
        if (r5h.X0(str)) {
            ore.p("Blank serial names are prohibited");
            return null;
        }
        tr3 tr3Var = new tr3(str);
        cf7Var.invoke(tr3Var);
        return new hif(str, c6h.f, tr3Var.c.size(), a.n1(fifVarArr), tr3Var);
    }

    public static List k0(Serializable serializable) {
        return Collections.singletonList(serializable);
    }

    public static final hif l(String str, lvb lvbVar, fif[] fifVarArr, cf7 cf7Var) {
        if (r5h.X0(str)) {
            ore.p("Blank serial names are prohibited");
            return null;
        }
        if (lvbVar.equals(c6h.f)) {
            ore.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        tr3 tr3Var = new tr3(str);
        cf7Var.invoke(tr3Var);
        return new hif(str, lvbVar, tr3Var.c.size(), a.n1(fifVarArr), tr3Var);
    }

    public static final String l0(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("tracer", 0);
        String str = null;
        String string = sharedPreferences.getString(AnalyticsBaseParamsConstantsKt.DEVICE_ID, null);
        String str2 = string == null ? "00000000-0000-0000-0000-000000000000" : string;
        try {
            File fileQ0 = lu6.q0(context.getFilesDir(), "tracer");
            sb8.U(fileQ0);
            File fileQ1 = lu6.q0(fileQ0, DeviceIdFileDataSource.DEVICE_ID_FILE_NAME);
            if (fileQ1.exists()) {
                try {
                    String string2 = r5h.y1(lu6.p0(fileQ1, pt2.a)).toString();
                    if (string2.length() > 0) {
                        str = string2;
                    }
                } catch (IOException unused) {
                }
            }
            if (str != null) {
                return str;
            }
            String string3 = string == null ? UUID.randomUUID().toString() : string;
            FileOutputStream fileOutputStream = new FileOutputStream(fileQ1);
            try {
                fileOutputStream.write(string3.getBytes(pt2.a));
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (string != null) {
                    sharedPreferences.edit().remove(AnalyticsBaseParamsConstantsKt.DEVICE_ID).apply();
                }
                return string3;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused2) {
            return str2;
        }
    }

    public static hif m(String str, lvb lvbVar, fif[] fifVarArr) {
        if (r5h.X0(str)) {
            ore.p("Blank serial names are prohibited");
            return null;
        }
        if (lvbVar.equals(c6h.f)) {
            ore.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        tr3 tr3Var = new tr3(str);
        return new hif(str, lvbVar, tr3Var.c.size(), a.n1(fifVarArr), tr3Var);
    }

    public static boolean m0(String str) {
        zab zabVar;
        synchronized (yab.class) {
            zabVar = a;
            if (zabVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return zabVar.b(str);
    }

    public static void n(String str, boolean z) {
        if (z) {
            return;
        }
        ore.p(str);
    }

    public static StaticLayout n0(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, cmh cmhVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(f2, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5);
        if (cmhVar == emh.a) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (cmhVar == emh.b) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else if (cmhVar == emh.c) {
            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else if (cmhVar == emh.d) {
            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        } else if (cmhVar == emh.e) {
            textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
        } else {
            textDirectionHeuristic = cmhVar == dmh.c ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        StaticLayout.Builder indents = maxLines.setTextDirection(textDirectionHeuristic).setBreakStrategy(0).setHyphenationFrequency(0).setIndents(null, null);
        indents.setJustificationMode(0);
        if (Build.VERSION.SDK_INT >= 28) {
            indents.setUseLineSpacingFromFallbacks(false);
        }
        return indents.build();
    }

    public static void o(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            nbh.G(sb, "Must be called on ", name2, " thread, but got ", name);
            qr7.m(sb, ".");
        }
    }

    public static final u8b o0(u8b u8bVar) {
        u8b u8bVar2 = new u8b(u8bVar.b);
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            r5d r5dVar = (r5d) objArr[i2];
            u8bVar2.b(new k5d(r5dVar.a, r5dVar.b));
        }
        return u8bVar2;
    }

    public static void p(String str) {
        if (TextUtils.isEmpty(str)) {
            ore.p("Given String is empty or null");
        }
    }

    public static final n5d p0(ed7 ed7Var) {
        if (ed7Var == null) {
            return null;
        }
        int i = ed7Var.b;
        u8b u8bVar = (u8b) ed7Var.c;
        u8b u8bVar2 = new u8b(u8bVar.b);
        Object[] objArr = u8bVar.a;
        int i2 = u8bVar.b;
        int i3 = 0;
        while (i3 < i2) {
            aad aadVar = (aad) objArr[i3];
            u8b u8bVar3 = aadVar.c;
            u8b u8bVar4 = new u8b(u8bVar3.b);
            Object[] objArr2 = u8bVar3.a;
            int i4 = u8bVar3.b;
            int i5 = 0;
            while (i5 < i4) {
                b6d b6dVar = (b6d) objArr2[i5];
                u8bVar4.b(new l5d(b6dVar.a, b6dVar.b));
                i5++;
                i3 = i3;
            }
            u8bVar2.b(new m5d(aadVar.a, aadVar.b, u8bVar4, aadVar.d, aadVar.e));
            i3++;
        }
        return new n5d(i, u8bVar2, (LinkedHashSet) ed7Var.d);
    }

    public static void q(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ore.p(str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:432:0x05f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Switch 'out' block B:44:0x00dc for B:152:0x0278 already processed. Defaulting to fallback option. */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v141, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v157, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v173, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v191, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v200 */
    /* JADX WARN: Type inference failed for: r0v207, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v208, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v236, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v25, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v252, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v258 */
    /* JADX WARN: Type inference failed for: r0v259 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v260 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [gda, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r44v5 */
    /* JADX WARN: Type inference failed for: r44v6 */
    /* JADX WARN: Type inference failed for: r44v7 */
    /* JADX WARN: Type inference failed for: r44v8 */
    public static gda q0(fka fkaVar) {
        int iU;
        int i;
        ?? W;
        Long lValueOf;
        String strX;
        xja xjaVar;
        Long lValueOf2;
        ?? r44;
        int i2;
        ?? arrayList;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        ?? W2;
        eka ekaVar;
        Long lValueOf6;
        Long lValueOf7;
        int i3 = 1;
        ?? r11 = 0;
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
        b50 b50Var = new b50();
        eka ekaVar2 = eka.UNKNOWN;
        b50 b50VarA = b50Var;
        long jLongValue = 0;
        long jLongValue2 = 0;
        long jLongValue3 = 0;
        long jLongValue4 = 0;
        long jLongValue5 = 0;
        long jLongValue6 = 0;
        long jLongValue7 = 0;
        xja xjaVar2 = null;
        ?? Intern = 0;
        dia diaVarA = null;
        vja vjaVarA = null;
        cja cjaVarA = null;
        ng5 ng5VarA = null;
        hja hjaVarB = null;
        afa afaVarA = null;
        eka ekaVar3 = ekaVar2;
        List listO1 = r66.a;
        int i4 = 0;
        int iIntValue = 0;
        while (i4 < iU) {
            try {
                i = 0;
                W = ch3.W(fkaVar);
            } catch (Throwable th3) {
                i = 0;
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(r11, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 == i3) {
                        throw th3;
                    }
                    ore.o();
                    return r11;
                }
                W = r11;
            }
            if (W != 0) {
                switch (W.hashCode()) {
                    case -1745040715:
                        if (W.equals("constructorId")) {
                            try {
                                ch3.T(fkaVar, 0L);
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
                                    if (iD4 == 1) {
                                        throw th7;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                        i2 = 1;
                        r44 = 0;
                        break;
                    case -1716357513:
                        if (!W.equals("reactionInfo")) {
                            fkaVar.x();
                        } else {
                            hjaVarB = ftk.b(fkaVar);
                        }
                        i2 = 1;
                        r44 = 0;
                        break;
                    case -1249474914:
                        if (!W.equals("options")) {
                            fkaVar.x();
                        } else {
                            Integer numValueOf = Integer.valueOf(i);
                            try {
                                numValueOf = Integer.valueOf(ch3.R(fkaVar, i));
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
                            }
                            iIntValue = numValueOf.intValue();
                        }
                        i2 = 1;
                        r44 = 0;
                        break;
                    case -905962955:
                        if (!W.equals("sender")) {
                            fkaVar.x();
                        } else {
                            try {
                                lValueOf = Long.valueOf(ch3.T(fkaVar, 0L));
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
                                lValueOf = 0L;
                            }
                            jLongValue4 = lValueOf.longValue();
                        }
                        i2 = 1;
                        r44 = 0;
                        break;
                    case -892481550:
                        ?? r12 = r11;
                        if (!W.equals("status")) {
                            fkaVar.x();
                        } else {
                            HashMap map = xja.a;
                            try {
                                strX = ch3.X(fkaVar, r12);
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
                                strX = null;
                            }
                            if (strX == null || strX.length() == 0 || (xjaVar = (xja) xja.a.get(strX)) == null) {
                                xjaVar = xja.b;
                            }
                            xjaVar2 = xjaVar;
                        }
                        i2 = 1;
                        r44 = 0;
                        break;
                    case -295931082:
                        if (W.equals("updateTime")) {
                            try {
                                lValueOf2 = Long.valueOf(ch3.T(fkaVar, 0L));
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
                                lValueOf2 = 0L;
                            }
                            jLongValue3 = lValueOf2.longValue();
                            r44 = 0;
                            i2 = 1;
                        } else {
                            fkaVar.x();
                            i2 = 1;
                            r44 = 0;
                        }
                        break;
                    case -8339209:
                        if (!W.equals("elements")) {
                            fkaVar.x();
                        } else {
                            if (fkaVar.y().a() == 7) {
                                arrayList = new ArrayList();
                                int iT0 = fkaVar.t0();
                                for (int i5 = i; i5 < iT0; i5++) {
                                    aga agaVarA = zfa.a(fkaVar);
                                    if (agaVarA != null) {
                                        arrayList.add(agaVarA);
                                    }
                                }
                            } else {
                                fkaVar.x();
                                arrayList = Collections.EMPTY_LIST;
                            }
                            listO1 = ww3.o1((Iterable) arrayList);
                        }
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 3355:
                        if (W.equals("id")) {
                            try {
                                lValueOf3 = Long.valueOf(ch3.T(fkaVar, 0L));
                            } catch (Throwable th17) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                Iterator it9 = fjf.a.iterator();
                                while (it9.hasNext()) {
                                    AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th17);
                                        accountInitializer9.d().i().g().a(r11, th17);
                                    } catch (Throwable th18) {
                                        gm0.V("Payload", "failed to collect exception", th18);
                                    }
                                }
                                int iD9 = qt4.D(pye.a);
                                if (iD9 != 0) {
                                    if (iD9 == i3) {
                                        throw th17;
                                    }
                                    ore.o();
                                    return r11;
                                }
                                lValueOf3 = 0L;
                            }
                            jLongValue = lValueOf3.longValue();
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 98494:
                        if (W.equals("cid")) {
                            try {
                                lValueOf4 = Long.valueOf(ch3.T(fkaVar, 0L));
                            } catch (Throwable th19) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                Iterator it10 = fjf.a.iterator();
                                while (it10.hasNext()) {
                                    AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th19);
                                        accountInitializer10.d().i().g().a(r11, th19);
                                    } catch (Throwable th20) {
                                        gm0.V("Payload", "failed to collect exception", th20);
                                    }
                                }
                                int iD10 = qt4.D(pye.a);
                                if (iD10 != 0) {
                                    if (iD10 == i3) {
                                        throw th19;
                                    }
                                    ore.o();
                                    return r11;
                                }
                                lValueOf4 = 0L;
                            }
                            jLongValue5 = lValueOf4.longValue();
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 3321850:
                        if (W.equals("link")) {
                            diaVarA = dia.a(fkaVar);
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 3556653:
                        if (W.equals("text")) {
                            try {
                                String strW = ch3.W(fkaVar);
                                Intern = strW != null ? strW.intern() : r11;
                            } catch (Throwable th21) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                                Iterator it11 = fjf.a.iterator();
                                while (it11.hasNext()) {
                                    AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th21);
                                        accountInitializer11.d().i().g().a(r11, th21);
                                    } catch (Throwable th22) {
                                        gm0.V("Payload", "failed to collect exception", th22);
                                    }
                                }
                                int iD11 = qt4.D(pye.a);
                                if (iD11 != 0) {
                                    if (iD11 == i3) {
                                        throw th21;
                                    }
                                    ore.o();
                                    return r11;
                                }
                                Intern = r11;
                            }
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 3560141:
                        if (W.equals("time")) {
                            try {
                                lValueOf5 = Long.valueOf(ch3.T(fkaVar, 0L));
                            } catch (Throwable th23) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                                Iterator it12 = fjf.a.iterator();
                                while (it12.hasNext()) {
                                    AccountInitializer accountInitializer12 = ((n6) it12.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th23);
                                        accountInitializer12.d().i().g().a(r11, th23);
                                    } catch (Throwable th24) {
                                        gm0.V("Payload", "failed to collect exception", th24);
                                    }
                                }
                                int iD12 = qt4.D(pye.a);
                                if (iD12 != 0) {
                                    if (iD12 == i3) {
                                        throw th23;
                                    }
                                    ore.o();
                                    return r11;
                                }
                                lValueOf5 = 0L;
                            }
                            jLongValue2 = lValueOf5.longValue();
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 3575610:
                        if (W.equals("type")) {
                            try {
                                W2 = ch3.W(fkaVar);
                            } catch (Throwable th25) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                Iterator it13 = fjf.a.iterator();
                                while (it13.hasNext()) {
                                    AccountInitializer accountInitializer13 = ((n6) it13.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th25);
                                        accountInitializer13.d().i().g().a(r11, th25);
                                    } catch (Throwable th26) {
                                        gm0.V("Payload", "failed to collect exception", th26);
                                    }
                                }
                                int iD13 = qt4.D(pye.a);
                                if (iD13 != 0) {
                                    if (iD13 == i3) {
                                        throw th25;
                                    }
                                    ore.o();
                                    return r11;
                                }
                                W2 = r11;
                            }
                            W2.getClass();
                            int i6 = -1;
                            switch (W2.hashCode()) {
                                case 2614219:
                                    if (W2.equals("USER")) {
                                        i6 = i;
                                    }
                                    break;
                                case 68091487:
                                    if (W2.equals("GROUP")) {
                                        i6 = i3;
                                    }
                                    break;
                                case 1456933091:
                                    if (W2.equals("CHANNEL")) {
                                        i6 = 2;
                                    }
                                    break;
                                case 1499988179:
                                    if (W2.equals("CHANNEL_ADMIN")) {
                                        i6 = 3;
                                    }
                                    break;
                            }
                            switch (i6) {
                                case 0:
                                    ekaVar = eka.USER;
                                    ekaVar3 = ekaVar;
                                    break;
                                case 1:
                                    ekaVar = eka.GROUP;
                                    ekaVar3 = ekaVar;
                                    break;
                                case 2:
                                    ekaVar = eka.CHANNEL;
                                    ekaVar3 = ekaVar;
                                    break;
                                case 3:
                                    ekaVar = eka.CHANNEL_ADMIN;
                                    ekaVar3 = ekaVar;
                                    break;
                                default:
                                    ekaVar3 = ekaVar2;
                                    break;
                            }
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 109757599:
                        if (W.equals("stats")) {
                            vjaVarA = vja.a(fkaVar);
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 538738099:
                        if (W.equals("attaches")) {
                            b50VarA = b50.a(fkaVar);
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 538883521:
                        if (W.equals("messagePreview")) {
                            cjaVarA = cja.a(fkaVar);
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 812817602:
                        if (W.equals("commentsInfo")) {
                            afaVarA = nsk.a(fkaVar);
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 999592402:
                        if (W.equals("liveUntil")) {
                            try {
                                lValueOf6 = Long.valueOf(ch3.T(fkaVar, 0L));
                            } catch (Throwable th27) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th27);
                                Iterator it14 = fjf.a.iterator();
                                while (it14.hasNext()) {
                                    AccountInitializer accountInitializer14 = ((n6) it14.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th27);
                                        accountInitializer14.d().i().g().a(r11, th27);
                                    } catch (Throwable th28) {
                                        gm0.V("Payload", "failed to collect exception", th28);
                                    }
                                }
                                int iD14 = qt4.D(pye.a);
                                if (iD14 != 0) {
                                    if (iD14 == i3) {
                                        throw th27;
                                    }
                                    ore.o();
                                    return r11;
                                }
                                lValueOf6 = 0L;
                            }
                            jLongValue7 = lValueOf6.longValue();
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 1195845394:
                        if (W.equals("viewTime")) {
                            try {
                                lValueOf7 = Long.valueOf(ch3.T(fkaVar, 0L));
                            } catch (Throwable th29) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th29);
                                Iterator it15 = fjf.a.iterator();
                                while (it15.hasNext()) {
                                    AccountInitializer accountInitializer15 = ((n6) it15.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th29);
                                        accountInitializer15.d().i().g().a(r11, th29);
                                    } catch (Throwable th30) {
                                        gm0.V("Payload", "failed to collect exception", th30);
                                    }
                                }
                                int iD15 = qt4.D(pye.a);
                                if (iD15 != 0) {
                                    if (iD15 == i3) {
                                        throw th29;
                                    }
                                    ore.o();
                                    return r11;
                                }
                                lValueOf7 = 0L;
                            }
                            jLongValue6 = lValueOf7.longValue();
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    case 2077959257:
                        if (W.equals("delayedAttributes")) {
                            ng5VarA = srl.a(fkaVar);
                            r44 = r11;
                            i2 = i3;
                        }
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                    default:
                        fkaVar.x();
                        i2 = 1;
                        r44 = 0;
                        break;
                }
            } else {
                r44 = r11;
                i2 = i3;
            }
            i4++;
            i3 = i2;
            r11 = r44;
            Intern = Intern;
        }
        return new gda(jLongValue, jLongValue2, jLongValue3, jLongValue4, xjaVar2, jLongValue5, Intern, b50VarA, diaVarA, ekaVar3, vjaVarA, jLongValue6, iIntValue, jLongValue7, cjaVarA, listO1, ng5VarA, hjaVarB, afaVarA);
    }

    public static void r(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        ore.k(str);
    }

    public static void r0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Activity activity) {
        if (b19.a(activity, androidXLifecycleHandlerImpl.getU1().a) == androidXLifecycleHandlerImpl) {
            androidXLifecycleHandlerImpl.getU1().b = activity;
            Iterator it = ww3.T1(androidXLifecycleHandlerImpl.getU1().j.values()).iterator();
            while (it.hasNext()) {
                ((p9) it.next()).v();
            }
        }
    }

    public static void s(Object obj) {
        if (obj != null) {
            return;
        }
        ore.n("null reference");
    }

    public static void s0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Activity activity) {
        if (androidXLifecycleHandlerImpl.getU1().b == activity) {
            Iterator it = N(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                ((p9) it.next()).r(activity);
            }
        }
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ore.n(str);
    }

    public static void t0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Activity activity) {
        if (androidXLifecycleHandlerImpl.getU1().b == activity) {
            Iterator it = N(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                ((p9) it.next()).s(activity);
            }
        }
    }

    public static void u(String str, boolean z) {
        if (z) {
            return;
        }
        ore.k(str);
    }

    public static void u0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Activity activity, Bundle bundle) {
        if (androidXLifecycleHandlerImpl.getU1().b == activity) {
            y0(androidXLifecycleHandlerImpl);
            for (p9 p9Var : N(androidXLifecycleHandlerImpl)) {
                Bundle bundle2 = new Bundle();
                p9Var.Q(bundle2);
                StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
                ViewGroup viewGroup = p9Var.i;
                sb.append(viewGroup != null ? viewGroup.getId() : 0);
                bundle.putBundle(sb.toString(), bundle2);
            }
        }
    }

    public static void v(boolean z) {
        if (z) {
            return;
        }
        c.t();
    }

    public static void v0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Activity activity) {
        if (androidXLifecycleHandlerImpl.getU1().b == activity) {
            androidXLifecycleHandlerImpl.getU1().f = false;
            Iterator it = N(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                ((p9) it.next()).t(activity);
            }
        }
    }

    public static c79 w() {
        return new c79(10);
    }

    public static void w0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, Activity activity) {
        if (androidXLifecycleHandlerImpl.getU1().b == activity) {
            y0(androidXLifecycleHandlerImpl);
            Iterator it = N(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                ((p9) it.next()).u(activity);
            }
        }
    }

    public static final v0f x(x7b x7bVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) x7bVar.b;
        c1f c1fVar = (c1f) linkedHashMap.get(e);
        if (c1fVar == null) {
            ore.p("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        i8j i8jVar = (i8j) linkedHashMap.get(f);
        if (i8jVar == null) {
            ore.p("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) linkedHashMap.get(g);
        String str = (String) linkedHashMap.get(khb.n);
        if (str == null) {
            ore.p("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        a1f a1fVarB = c1fVar.c().b();
        y0f y0fVar = a1fVarB instanceof y0f ? (y0f) a1fVarB : null;
        if (y0fVar == null) {
            ore.k("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        SavedStateHandlesVM savedStateHandlesVMO = O(i8jVar);
        v0f v0fVar = (v0f) savedStateHandlesVMO.b.get(str);
        if (v0fVar != null) {
            return v0fVar;
        }
        Class[] clsArr = v0f.f;
        y0fVar.b();
        Bundle bundle2 = y0fVar.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = y0fVar.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = y0fVar.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            y0fVar.c = null;
        }
        v0f v0fVarA = nol.a(bundle3, bundle);
        savedStateHandlesVMO.b.put(str, v0fVarA);
        return v0fVarA;
    }

    public static final Object x0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void y(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, boolean z) {
        if (androidXLifecycleHandlerImpl.getU1().d) {
            return;
        }
        androidXLifecycleHandlerImpl.getU1().d = true;
        Activity activity = androidXLifecycleHandlerImpl.getU1().b;
        if (activity != null) {
            Iterator it = N(androidXLifecycleHandlerImpl).iterator();
            while (it.hasNext()) {
                ((p9) it.next()).q(activity, z);
            }
        }
    }

    public static void y0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl) {
        if (androidXLifecycleHandlerImpl.getU1().f) {
            return;
        }
        androidXLifecycleHandlerImpl.getU1().f = true;
        Iterator it = N(androidXLifecycleHandlerImpl).iterator();
        while (it.hasNext()) {
            ((p9) it.next()).H();
        }
    }

    public static final void z(c1f c1fVar) {
        n09 n09Var = c1fVar.f().d;
        if (n09Var != n09.b && n09Var != n09.c) {
            ore.p("Failed requirement.");
        } else if (c1fVar.c().b() == null) {
            y0f y0fVar = new y0f(c1fVar.c(), (i8j) c1fVar);
            c1fVar.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", y0fVar);
            c1fVar.f().a(new kee(4, y0fVar));
        }
    }

    public static final long z0(v44 v44Var, long j) {
        long j2 = v44Var.l(j).j();
        ew5 ew5Var = new ew5(j2);
        if (!ew5.m(j2)) {
            ew5Var = null;
        }
        if (ew5Var == null) {
            return 0L;
        }
        long j3 = ew5Var.a;
        return ew5.m(j3) ? ew5.v(j3) : j3;
    }

    public abstract void C0(boolean z);

    public abstract void D0(boolean z);

    public abstract void H(ixf ixfVar, float f2, float f3);

    public abstract InputFilter[] K(InputFilter[] inputFilterArr);

    public abstract TransformationMethod L0(TransformationMethod transformationMethod);

    public abstract boolean e0();
}
