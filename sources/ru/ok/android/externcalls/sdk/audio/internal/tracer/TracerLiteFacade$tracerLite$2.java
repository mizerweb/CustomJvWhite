package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import defpackage.a7g;
import defpackage.af7;
import defpackage.cf7;
import defpackage.jxh;
import defpackage.kxh;
import defpackage.sbi;
import defpackage.ux8;
import kotlin.Metadata;
import ru.ok.tracer.lite.TracerLite;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/tracer/lite/TracerLite;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class TracerLiteFacade$tracerLite$2 extends ux8 implements af7 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$tracerLite$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // defpackage.af7
    public final TracerLite invoke() {
        Context applicationContext = this.$context.getApplicationContext();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        jxh jxhVar = new jxh();
        anonymousClass1.invoke((Object) jxhVar);
        TracerLite tracerLite = new TracerLite(applicationContext, "one.video.calls.externcalls.sdk.audio", new kxh(jxhVar));
        tracerLite.setKey(TracerLiteFacade.KEY_AUDIOMANAGER_VERSION, "0.1.2");
        return tracerLite;
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade$tracerLite$2$1 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljxh;", "Lsbi;", "invoke", "(Ljxh;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends ux8 implements cf7 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(jxh jxhVar) {
            jxhVar.b = new a7g("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
        }

        @Override // defpackage.cf7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((jxh) obj);
            return sbi.a;
        }
    }
}
