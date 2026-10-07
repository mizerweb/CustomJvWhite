package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioRecord;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.HttpStatus;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import org.webrtc.HardwareVideoEncoderV2;
import org.webrtc.audio.WebRtcAudioRecord;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vs4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vs4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        Object poeVar;
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName componentNameStartService;
        int i2 = -1;
        int i3 = 0;
        String str2 = 0;
        str2 = 0;
        switch (this.a) {
            case 0:
                return ConversationStart.execute$lambda$0((ConversationStart) this.b, (StartConversationDelegate.Params) this.c);
            case 1:
                w25 w25Var = (w25) this.b;
                byte[] bArr = (byte[]) this.c;
                boolean z = w25Var.e;
                Bitmap bitmapA = xel.a(bArr, bArr.length, w25Var.d, w25Var.c);
                return z ? xel.b(bitmapA) : bitmapA;
            case 2:
                w25 w25Var2 = (w25) this.b;
                Uri uri = (Uri) this.c;
                q95 q95VarA = w25Var2.b.a();
                BitmapFactory.Options options = w25Var2.c;
                int i4 = w25Var2.d;
                boolean z2 = w25Var2.e;
                try {
                    q95VarA.f(new a35(uri));
                    byte[] bArrCopyOf = new byte[1024];
                    int i5 = 0;
                    while (i3 != -1) {
                        if (i5 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i3 = q95VarA.read(bArrCopyOf, i5, bArrCopyOf.length - i5);
                        if (i3 != -1) {
                            i5 += i3;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i5);
                    Bitmap bitmapA2 = xel.a(bArrCopyOf2, bArrCopyOf2.length, i4, options);
                    if (z2) {
                        bitmapA2 = xel.b(bitmapA2);
                        break;
                    }
                    return bitmapA2;
                } finally {
                    q95VarA.close();
                }
            case 3:
                return EglThread.lambda$create$0((EglBase.Context) this.b, (int[]) this.c);
            case 4:
                ug5 ug5Var = (ug5) this.b;
                af7 af7Var = (af7) this.c;
                ReentrantLock reentrantLock = (ReentrantLock) ug5Var.e;
                reentrantLock.lock();
                try {
                    af7Var.invoke();
                    return sbi.a;
                } finally {
                    reentrantLock.unlock();
                }
            case 5:
                il6 il6Var = (il6) this.b;
                jl6 jl6Var = (jl6) this.c;
                String str3 = il6Var.a;
                StartCallApiParams startCallApiParams = il6Var.b;
                eq8 eq8Var = new eq8(str3, jl6Var.j.a(startCallApiParams), startCallApiParams.getIsVideo());
                o3c o3cVar = (o3c) jl6Var.i;
                o3cVar.getClass();
                try {
                    poeVar = (hq8) yab.A0(k66.a, new awa(o3cVar, eq8Var, (lq4) str2, 11));
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                Object fq8Var = poeVar;
                if (thA != null) {
                    fq8Var = new fq8(thA);
                }
                return (hq8) fq8Var;
            case 6:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                ljf ljfVarD = ljf.D();
                ljfVarD.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) ljfVarD.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (ljfVarD) {
                    try {
                        String str4 = (String) ljfVarD.b;
                        if (str4 != null) {
                            str2 = str4;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    ljfVarD.b = context.getPackageName() + serviceInfo.name;
                                } else {
                                    ljfVarD.b = serviceInfo.name;
                                }
                                str2 = (String) ljfVarD.b;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (str2 != 0) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (ljfVarD.L(context)) {
                        componentNameStartService = tpk.e(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = HttpStatus.SC_NOT_FOUND;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = HttpStatus.SC_PAYMENT_REQUIRED;
                    i2 = i;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = HttpStatus.SC_UNAUTHORIZED;
                    i2 = i;
                }
                return Integer.valueOf(i2);
            case 7:
                return ((HardwareVideoEncoderV2) this.b).lambda$initEncodeInternal$0((MediaFormat) this.c);
            case 8:
                return ((InternalIdsResolver) this.b).lambda$resolveIdsAndGetFailed$0((MappingContext) this.c);
            case 9:
                nxe nxeVar = (nxe) this.b;
                zo zoVar = (zo) this.c;
                Object objA = nxeVar.a.a(zoVar);
                if (objA != null) {
                    return objA;
                }
                StringBuilder sb = new StringBuilder("Parsed api value was null. Request: ");
                sb.append(zoVar);
                String strA = etk.a(zoVar);
                hu8 okParser = zoVar.getOkParser();
                sb.append(", method: ");
                sb.append(strA);
                sb.append(", parser: ");
                sb.append(okParser);
                throw new NullPointerException(sb.toString());
            default:
                return ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
        }
    }
}
