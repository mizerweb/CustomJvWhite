package ru.ok.android.externcalls.sdk.watch_together.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/WatchTogetherListener;", "", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;", "startInfo", "Lsbi;", "onVideoStarted", "(Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;", "states", "onVideoStatesChanged", "(Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStates;)V", "Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "stopInfo", "onVideoStopped", "(Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface WatchTogetherListener {
    void onVideoStarted(MovieStartedData startInfo);

    void onVideoStatesChanged(MovieStates states);

    void onVideoStopped(MovieStoppedData stopInfo);
}
