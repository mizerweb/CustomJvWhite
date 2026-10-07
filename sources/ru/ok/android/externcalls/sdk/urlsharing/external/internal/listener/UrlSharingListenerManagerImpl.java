package ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener;

import defpackage.alg;
import defpackage.bnf;
import defpackage.c6g;
import defpackage.cqk;
import defpackage.d12;
import defpackage.dnf;
import defpackage.e12;
import defpackage.f12;
import defpackage.f4g;
import defpackage.g12;
import defpackage.h12;
import defpackage.j95;
import defpackage.o42;
import defpackage.p42;
import defpackage.y3e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;", "Lp42;", "Lh12;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Ly3e;", "logger", "<init>", "(Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Ly3e;)V", "Ldnf;", "roomId", "Lc6g;", "info", "Lsbi;", "saveUrlSharing", "(Ldnf;Lc6g;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiator", "", MLFeatureConfigProviderBase.URL_KEY, "saveUrlSharingWithId", "(Ldnf;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;)V", "reportForActiveRoom", "()V", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;)V", "removeListener", "Lo42;", "state", "onUrlSharingInfoUpdated", "(Lo42;)V", "Ld12;", "params", "onCurrentParticipantActiveRoomChanged", "(Ld12;)V", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Ly3e;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingInfo;", "roomIdToUrlSharingInfo", "Ljava/util/Map;", "activeRoomId", "Ldnf;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UrlSharingListenerManagerImpl implements UrlSharingListenerManager, p42, h12 {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UrlSharingListenerManagerImpl";
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final y3e logger;
    private final CopyOnWriteArraySet<UrlSharingListener> listeners = new CopyOnWriteArraySet<>();
    private Map<dnf, UrlSharingInfo> roomIdToUrlSharingInfo = new HashMap();
    private dnf activeRoomId = bnf.a;

    public UrlSharingListenerManagerImpl(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, y3e y3eVar) {
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        this.logger = y3eVar;
    }

    private final void reportForActiveRoom() {
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        for (UrlSharingListener urlSharingListener : this.listeners) {
            if (urlSharingInfo == null) {
                urlSharingListener.onUrlSharingStopped();
            } else {
                urlSharingListener.onUrlSharingStarted(urlSharingInfo);
            }
        }
    }

    private final void saveUrlSharing(dnf roomId, c6g info) {
        ParticipantId byInternal = this.idMappingWrapper.getByInternal(info.a);
        if (byInternal != null) {
            saveUrlSharingWithId(roomId, byInternal, info.b);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(info.a), new alg(this, info, roomId, 4), new f4g(17, this));
        }
    }

    public static final void saveUrlSharing$lambda$0(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl, c6g c6gVar, dnf dnfVar) {
        ParticipantId byInternal = urlSharingListenerManagerImpl.idMappingWrapper.getByInternal(c6gVar.a);
        if (byInternal == null) {
            return;
        }
        urlSharingListenerManagerImpl.saveUrlSharingWithId(dnfVar, byInternal, c6gVar.b);
    }

    public static final void saveUrlSharing$lambda$1(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl) {
        urlSharingListenerManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void saveUrlSharingWithId(dnf roomId, ParticipantId initiator, String str) {
        this.roomIdToUrlSharingInfo.put(roomId, new UrlSharingInfo(str, initiator));
        if (cqk.d(roomId, this.activeRoomId)) {
            reportForActiveRoom();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void addListener(UrlSharingListener listener) {
        this.listeners.add(listener);
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        if (urlSharingInfo != null) {
            listener.onUrlSharingStarted(urlSharingInfo);
        }
    }

    @Override // defpackage.h12
    public void onCurrentParticipantActiveRoomChanged(d12 params) {
        dnf dnfVar = this.activeRoomId;
        dnf dnfVar2 = params.a;
        if (cqk.d(dnfVar, dnfVar2)) {
            return;
        }
        this.activeRoomId = dnfVar2;
        reportForActiveRoom();
    }

    @Override // defpackage.h12
    public void onCurrentParticipantInvitedToRoom(e12 e12Var) {
        e12Var.getClass();
    }

    @Override // defpackage.h12
    public void onRoomRemoved(f12 f12Var) {
        f12Var.getClass();
    }

    @Override // defpackage.h12
    public void onRoomUpdated(g12 g12Var) {
        g12Var.getClass();
    }

    @Override // defpackage.p42
    public void onUrlSharingInfoUpdated(o42 state) {
        dnf dnfVar = state.a;
        c6g c6gVar = state.b;
        if (c6gVar != null) {
            saveUrlSharing(dnfVar, c6gVar);
            return;
        }
        this.roomIdToUrlSharingInfo.put(dnfVar, null);
        if (dnfVar.equals(this.activeRoomId)) {
            reportForActiveRoom();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void removeListener(UrlSharingListener listener) {
        this.listeners.remove(listener);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManagerImpl$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
