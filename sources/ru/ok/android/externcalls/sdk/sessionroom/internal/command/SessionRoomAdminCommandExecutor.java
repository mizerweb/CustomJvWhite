package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.a9;
import defpackage.af7;
import defpackage.cf7;
import defpackage.eje;
import defpackage.pfi;
import defpackage.yeh;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00152\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00182\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "", "La9;", "params", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(La9;Laf7;Lcf7;)V", "Lpfi;", "updateRooms", "(Lpfi;Laf7;Lcf7;)V", "Lyeh;", "switchRoom", "(Lyeh;Laf7;Lcf7;)V", "Leje;", "removeRooms", "(Leje;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Laf7;Lcf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface SessionRoomAdminCommandExecutor {
    void activateRooms(a9 params, af7 onSuccess, cf7 onError);

    void assignParticipantsToRooms(AssignParticipantsToRoomsParams params, af7 onSuccess, cf7 onError);

    void moveParticipant(MoveParticipantParams params, af7 onSuccess, cf7 onError);

    void removeRooms(eje params, af7 onSuccess, cf7 onError);

    void switchRoom(yeh params, af7 onSuccess, cf7 onError);

    void updateRooms(pfi params, af7 onSuccess, cf7 onError);
}
