package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lb implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lb(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AddParticipantsCommands.addParticipantsExtIds$lambda$0$0((cf7) obj2, (AddParticipantsCommands) obj, jSONObject);
                break;
            case 1:
                AddParticipantsCommands.addParticipantByLink$lambda$0$1((sg4) obj2, (AddParticipantsCommands) obj, jSONObject);
                break;
            case 2:
                RecordManagerImpl.stopRecord$lambda$0((RecordManager.StopParams) obj2, (af7) obj, jSONObject);
                break;
            default:
                RecordManagerImpl.startRecord$lambda$0((RecordManager.StartParams) obj2, (af7) obj, jSONObject);
                break;
        }
    }
}
