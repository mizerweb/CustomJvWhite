package defpackage;

import android.view.Surface;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.o.k;
import java.util.concurrent.Executor;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d7i implements t65, s72, u8g, EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d7i(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        i5b i5bVar = (i5b) this.b;
        ich ichVar = (ich) this.c;
        try {
            m86 m86VarA = ((z76) i5bVar.e).a((Executor) i5bVar.c, (kj0) this.d, ichVar.g);
            i5bVar.f = m86VarA;
            t76 t76Var = m86VarA.f;
            if (t76Var instanceof l86) {
                Surface surfaceA = ((l86) t76Var).a();
                i5bVar.g = surfaceA;
                tvj.a("VideoEncoderSession", "provide surface: " + surfaceA);
                ichVar.b(surfaceA, (Executor) i5bVar.d, new mx1(6, i5bVar));
                i5bVar.b = 4;
                r72Var.b((m86) i5bVar.f);
            } else {
                r72Var.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e) {
            tvj.d("VideoEncoderSession", "Unable to initialize video encoder.", e);
            r72Var.d(e);
        }
        return "ConfigureVideoEncoderFuture " + i5bVar;
    }

    @Override // defpackage.u8g
    public void c(b8g b8gVar) {
        WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$0((o91) this.b, (h62) this.c, (WaitingRoomParticipants) this.d, b8gVar);
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 3:
                return ((d) obj3).a((String) obj2, (String) obj, insertEventTools);
            default:
                return ((k) obj3).a((String) obj2, (String) obj, insertEventTools);
        }
    }

    @Override // defpackage.t65
    public Object t() {
        return new TwoFACreationScreen("CREATE", "CREATE_PASSWORD", (String) this.b, (String) this.c, (ha9) this.d, null, 32, null);
    }

    public /* synthetic */ d7i(Object obj, String str, String str2, int i) {
        this.a = i;
        this.d = obj;
        this.b = str;
        this.c = str2;
    }
}
