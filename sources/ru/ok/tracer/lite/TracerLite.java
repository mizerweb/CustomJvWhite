package ru.ok.tracer.lite;

import android.content.Context;
import android.util.Log;
import defpackage.aof;
import defpackage.axh;
import defpackage.cxh;
import defpackage.dxh;
import defpackage.j95;
import defpackage.jxh;
import defpackage.kxh;
import defpackage.lhh;
import defpackage.lxh;
import defpackage.nxh;
import defpackage.ny8;
import defpackage.oxh;
import defpackage.pxh;
import defpackage.r5h;
import defpackage.rx8;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0006B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010E\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bD\u0010\u0013R\u0013\u0010G\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bF\u0010\u0013¨\u0006H"}, d2 = {"Lru/ok/tracer/lite/TracerLite;", "", "Landroid/content/Context;", "context", "", "libraryPackageName", "Lkxh;", "configuration", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkxh;)V", "Lsbi;", "disable", "()V", "key", SdkMetricStatEvent.VALUE_KEY, "setKey", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLibraryPackageName", "()Ljava/lang/String;", "getLibraryPackageName$annotations", "Lkxh;", "getConfiguration", "()Lkxh;", "", "isExplicitlyDisabled", "Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lpxh;", "manifest$delegate", "Lny8;", "getManifest", "()Lpxh;", "manifest", "Ldxh;", "libraryInfo$delegate", "getLibraryInfo", "()Ldxh;", "libraryInfo", "Llhh;", "tagsStorage", "Llhh;", "getTagsStorage$tracer_lite_commons_release", "()Llhh;", "Laxh;", "dropHolder", "Laxh;", "getDropHolder$tracer_lite_commons_release", "()Laxh;", "Lnxh;", "httpClientHolder", "Lnxh;", "getHttpClientHolder$tracer_lite_commons_release", "()Lnxh;", "Lcxh;", "executorHolder", "Lcxh;", "getExecutorHolder$tracer_lite_commons_release", "()Lcxh;", "Loxh;", "limits", "Loxh;", "getLimits$tracer_lite_commons_release", "()Loxh;", "isDisabled", "()Z", "getSessionUuid", "sessionUuid", "getLibToken", "libToken", "tracer-lite-commons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TracerLite {
    private final kxh configuration;
    private final Context context;
    private final axh dropHolder;
    private final cxh executorHolder;
    private final nxh httpClientHolder;
    private volatile boolean isExplicitlyDisabled;

    /* JADX INFO: renamed from: libraryInfo$delegate, reason: from kotlin metadata */
    private final ny8 libraryInfo;
    private final String libraryPackageName;
    private final oxh limits;

    /* JADX INFO: renamed from: manifest$delegate, reason: from kotlin metadata */
    private final ny8 manifest;
    private final lhh tagsStorage;

    public TracerLite(Context context, String str, kxh kxhVar) {
        this.libraryPackageName = str;
        this.configuration = kxhVar;
        this.context = context.getApplicationContext();
        this.manifest = rx8.P(2, new lxh(this, 1));
        this.libraryInfo = rx8.P(2, new lxh(this, 0));
        this.tagsStorage = new lhh();
        this.dropHolder = new axh(context, str);
        this.httpClientHolder = new nxh(context, str);
        this.executorHolder = new cxh(str);
        this.limits = new oxh(context, str);
    }

    public static /* synthetic */ void getLibraryPackageName$annotations() {
    }

    public final pxh getManifest() {
        return (pxh) this.manifest.getValue();
    }

    public final void disable() {
        this.isExplicitlyDisabled = true;
    }

    public final kxh getConfiguration() {
        return this.configuration;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: getDropHolder$tracer_lite_commons_release, reason: from getter */
    public final axh getDropHolder() {
        return this.dropHolder;
    }

    /* JADX INFO: renamed from: getExecutorHolder$tracer_lite_commons_release, reason: from getter */
    public final cxh getExecutorHolder() {
        return this.executorHolder;
    }

    /* JADX INFO: renamed from: getHttpClientHolder$tracer_lite_commons_release, reason: from getter */
    public final nxh getHttpClientHolder() {
        return this.httpClientHolder;
    }

    public final String getLibToken() {
        String str = (String) this.configuration.b.a;
        if (str != null) {
            return str;
        }
        pxh manifest = getManifest();
        if (manifest != null) {
            return manifest.d();
        }
        return null;
    }

    public final dxh getLibraryInfo() {
        return (dxh) this.libraryInfo.getValue();
    }

    public final String getLibraryPackageName() {
        return this.libraryPackageName;
    }

    /* JADX INFO: renamed from: getLimits$tracer_lite_commons_release, reason: from getter */
    public final oxh getLimits() {
        return this.limits;
    }

    public final String getSessionUuid() {
        return aof.a;
    }

    /* JADX INFO: renamed from: getTagsStorage$tracer_lite_commons_release, reason: from getter */
    public final lhh getTagsStorage() {
        return this.tagsStorage;
    }

    public final boolean isDisabled() {
        return true;
    }

    public final void setKey(String key, String str) {
        if (this.isExplicitlyDisabled) {
            Log.d("Tracer", "Tracer is disabled");
            return;
        }
        lhh lhhVar = this.tagsStorage;
        lhhVar.getClass();
        String strU1 = r5h.u1(31, key);
        String strU2 = str != null ? r5h.u1(31, str) : null;
        synchronized (lhhVar.a) {
            String str2 = (String) lhhVar.a.remove(strU1);
            if (strU2 != null) {
                lhhVar.a.put(strU1, strU2);
                if (str2 == null && lhhVar.a.size() > 30) {
                    lhhVar.a.entrySet().iterator().remove();
                }
            }
        }
    }

    public TracerLite(Context context, String str) {
        this(context, str, null, 4, null);
    }

    public TracerLite(Context context, String str, kxh kxhVar, int i, j95 j95Var) {
        this(context, str, (i & 4) != 0 ? new kxh(new jxh()) : kxhVar);
    }
}
