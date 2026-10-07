package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.media3.common.VideoFrameProcessingException;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hs4 implements rg4, wuh, hu8, InternalIdsResolver.ParticipantPrivateStateModifier, ExternalIdsResolver.ParticipantPrivateStateModifier, bg7, ine, mf7, zm7, r89 {
    public final /* synthetic */ int a;

    public /* synthetic */ hs4(wf wfVar) {
        this.a = 24;
    }

    public static /* synthetic */ void b() {
        throw new RuntimeException();
    }

    @Override // defpackage.zm7, defpackage.owi
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        lvb.l0("DebugViewShaderProgram", "Exception caught by errorListener.", videoFrameProcessingException);
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                ConversationFactory.lambda$hangup$15(obj);
                break;
            default:
                ConversationFactory.lambda$hangup$12((dt7) obj);
                break;
        }
    }

    @Override // defpackage.bg7, defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 7:
                return null;
            case 8:
            default:
                return c98.r(Integer.valueOf(((yq3) obj).a));
            case 9:
                yy4 yy4Var = (yy4) obj;
                Bundle bundleC = yy4Var.c();
                Bitmap bitmap = yy4Var.d;
                if (bitmap != null) {
                    bundleC.putParcelable(yy4.w, bitmap);
                }
                return bundleC;
            case 10:
                return yy4.b((Bundle) obj);
            case 11:
                long j = ((bz4) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // defpackage.ine
    public void d(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.wuh
    public String getToken() {
        return ConversationFactory.lambda$joinAnonByLinkInternal$9();
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        xf xfVar = (xf) obj;
        switch (this.a) {
            case 15:
                xfVar.getClass();
                break;
            case 16:
                xfVar.getClass();
                break;
            case 17:
                xfVar.getClass();
                break;
            case 18:
                xfVar.getClass();
                break;
            case 19:
                xfVar.getClass();
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                xfVar.getClass();
                break;
            case 21:
                xfVar.getClass();
                break;
            case 22:
                xfVar.getClass();
                break;
            case 23:
                xfVar.getClass();
                break;
            case 24:
                xfVar.getClass();
                break;
            case 25:
                xfVar.getClass();
                break;
            case 26:
                xfVar.getClass();
                break;
            case 27:
                xfVar.getClass();
                break;
            case 28:
                xfVar.getClass();
                break;
            default:
                xfVar.getClass();
                break;
        }
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        switch (this.a) {
            case 3:
                return ConversationFactory.lambda$hangup$14(vu8Var);
            default:
                return ConversationParams.parseCallParams(vu8Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ParticipantPrivateStateModifier
    public void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId) {
        conversationParticipant.setExternalId(participantId);
    }

    @Override // ru.ok.android.externcalls.sdk.id.InternalIdsResolver.ParticipantPrivateStateModifier
    public void setInternalId(ConversationParticipant conversationParticipant, yt1 yt1Var) {
        conversationParticipant.setInternalId(yt1Var);
    }

    public /* synthetic */ hs4(int i, long j, wf wfVar) {
        this.a = i;
    }

    public /* synthetic */ hs4(int i) {
        this.a = i;
    }

    public /* synthetic */ hs4(wf wfVar, int i, boolean z) {
        this.a = 21;
    }

    public /* synthetic */ hs4(wf wfVar, Object obj, int i) {
        this.a = i;
    }

    public /* synthetic */ hs4(wf wfVar, boolean z, int i) {
        this.a = 15;
    }
}
