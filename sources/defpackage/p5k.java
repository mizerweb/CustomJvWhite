package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.bq;
import one.video.calls.sdk_private.g;
import one.video.calls.sdk_private.j;
import one.video.calls.sdk_private.n;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p5k {
    /* JADX WARN: Code duplicated, block: B:189:0x03d1 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x03db A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x03e5 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03f6 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:200:0x0403 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x0410  */
    /* JADX WARN: Code duplicated, block: B:203:0x0416 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x041d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0423 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x042a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0430 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0437  */
    /* JADX WARN: Code duplicated, block: B:212:0x043d A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0444  */
    /* JADX WARN: Code duplicated, block: B:215:0x044a A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0451  */
    /* JADX WARN: Code duplicated, block: B:218:0x0457 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x045e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0464 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x046b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0471 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0479  */
    /* JADX WARN: Code duplicated, block: B:227:0x047f A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x0487  */
    /* JADX WARN: Code duplicated, block: B:230:0x048d A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0492  */
    /* JADX WARN: Code duplicated, block: B:233:0x0498 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x049d  */
    /* JADX WARN: Code duplicated, block: B:236:0x04a3 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:239:0x04b2 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x04be  */
    /* JADX WARN: Code duplicated, block: B:242:0x04c4 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d6 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x051a  */
    /* JADX WARN: Code duplicated, block: B:258:0x0522 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x052a  */
    /* JADX WARN: Code duplicated, block: B:261:0x052e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0536  */
    /* JADX WARN: Code duplicated, block: B:267:0x053e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0546  */
    /* JADX WARN: Code duplicated, block: B:273:0x054e  */
    /* JADX WARN: Code duplicated, block: B:276:0x0558  */
    /* JADX WARN: Code duplicated, block: B:280:0x0560  */
    /* JADX WARN: Code duplicated, block: B:283:0x0567  */
    /* JADX WARN: Code duplicated, block: B:286:0x0572  */
    /* JADX WARN: Code duplicated, block: B:289:0x057a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0585  */
    /* JADX WARN: Code duplicated, block: B:293:0x0586  */
    /* JADX WARN: Code duplicated, block: B:296:0x058e A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x059a A[Catch: bJ -> 0x05f6, bq -> 0x0601, LOOP:8: B:295:0x058c->B:299:0x059a, LOOP_END, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x05a5 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x05b7 A[Catch: bJ -> 0x05f6, bq -> 0x0601, TryCatch #2 {bJ -> 0x05f6, bq -> 0x0601, blocks: (B:187:0x03c3, B:189:0x03d1, B:191:0x03db, B:193:0x03e5, B:305:0x05cd, B:308:0x05dc, B:309:0x05e3, B:197:0x03f6, B:200:0x0403, B:203:0x0416, B:206:0x0423, B:209:0x0430, B:212:0x043d, B:215:0x044a, B:218:0x0457, B:221:0x0464, B:224:0x0471, B:227:0x047f, B:230:0x048d, B:233:0x0498, B:236:0x04a3, B:239:0x04b2, B:242:0x04c4, B:245:0x04d6, B:249:0x04dd, B:250:0x04e7, B:252:0x04ef, B:253:0x0502, B:254:0x0512, B:255:0x0519, B:258:0x0522, B:294:0x0587, B:296:0x058e, B:302:0x05a5, B:304:0x05c8, B:303:0x05b7, B:299:0x059a, B:310:0x05e4, B:311:0x05eb, B:312:0x05ec, B:313:0x05f5), top: B:350:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:307:0x05d4 A[LOOP:6: B:185:0x03bc->B:307:0x05d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:326:0x0619  */
    /* JADX WARN: Code duplicated, block: B:336:0x065b A[LOOP:0: B:6:0x0021->B:336:0x065b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:350:0x03c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x05ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x05a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:259:0x052a, please report this as an issue */
    public static ArrayList c(ByteBuffer byteBuffer, jfk jfkVar, atj atjVar) throws g {
        ArrayList arrayList;
        int i;
        Object obj;
        short s;
        int iPosition;
        HashSet hashSet;
        long jH;
        int iE;
        int iPosition2;
        String str;
        String str2;
        String str3;
        int length;
        int iCharCount;
        boolean z;
        int iCodePointAt;
        int i2;
        ArrayList arrayList2 = null;
        int i3 = 2;
        if (byteBuffer.remaining() < 2) {
            p51.g("Extension field must be at least 2 bytes long");
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        short s2 = 65535;
        int i4 = byteBuffer.getShort() & 65535;
        if (byteBuffer.remaining() < i4) {
            p51.g("Extensions too short");
            return null;
        }
        while (true) {
            int i5 = 4;
            if (i4 < 4) {
                return arrayList3;
            }
            int i6 = byteBuffer.getShort() & s2;
            int i7 = byteBuffer.getShort() & s2;
            int i8 = i4 - 4;
            if (i7 > i8) {
                ArrayList arrayList4 = arrayList2;
                p51.g("Extension length exceeds extensions length");
                return arrayList4;
            }
            int iPosition3 = byteBuffer.position();
            short s3 = ifk.server_name.a;
            int i9 = 1;
            short s4 = s2;
            if (i6 == s3) {
                do8 do8Var = new do8();
                int iA = do8Var.a(byteBuffer, s3, 0);
                if (iA <= 0) {
                    do8Var.b = arrayList2;
                } else {
                    if (iA < i3) {
                        p51.g("incorrect extension length");
                        return arrayList2;
                    }
                    int i10 = byteBuffer.getShort();
                    if (iA != i10 + 2) {
                        p51.g("inconsistent length");
                        return arrayList2;
                    }
                    while (i10 > 0) {
                        do8.c(i9, byteBuffer);
                        if (byteBuffer.get() != 0) {
                            do8.c(i3, byteBuffer);
                            i2 = byteBuffer.getShort() & s4;
                            do8.c(i2, byteBuffer);
                            if (i2 > byteBuffer.remaining()) {
                                p51.g("extension underflow");
                                return arrayList2;
                            }
                            byteBuffer.get(new byte[i2]);
                        } else {
                            do8.c(i3, byteBuffer);
                            i2 = byteBuffer.getShort() & s4;
                            do8.c(i2, byteBuffer);
                            byte[] bArr = new byte[i2];
                            byteBuffer.get(bArr);
                            do8Var.b = new String(bArr, Charset.forName(HTTP.ASCII));
                        }
                        i10 -= i2 + 3;
                        i3 = 2;
                        i9 = 1;
                    }
                    if (i10 < 0) {
                        p51.g("inconsistent length");
                        return arrayList2;
                    }
                }
                arrayList3.add(do8Var);
            } else if (i6 == ifk.supported_groups.a) {
                arrayList3.add(new q3e(byteBuffer, 1));
            } else {
                ifk ifkVar = ifk.signature_algorithms;
                if (i6 == ifkVar.a) {
                    r9i r9iVar = new r9i();
                    r9iVar.a = new ArrayList();
                    int iA2 = r9iVar.a(byteBuffer, ifkVar.a, 4);
                    short s5 = byteBuffer.getShort();
                    if (iA2 != s5 + 2) {
                        p51.g("inconsistent length");
                        return arrayList2;
                    }
                    if (s5 % 2 != 0) {
                        p51.g("invalid group length");
                        return arrayList2;
                    }
                    for (int i11 = 0; i11 < s5; i11 += 2) {
                        Arrays.stream(mfk.values()).filter(new r4k(byteBuffer.getShort() % s4, 4)).findFirst().ifPresent(new o01(23, r9iVar));
                    }
                    arrayList3.add(r9iVar);
                } else if (i6 == ifk.application_layer_protocol_negotiation.a) {
                    arrayList3.add(new do8(byteBuffer));
                } else {
                    ifk ifkVar2 = ifk.pre_shared_key;
                    short s6 = ifkVar2.a;
                    if (i6 != s6) {
                        arrayList = arrayList2;
                        i = i8;
                        short s7 = ifk.early_data.a;
                        if (i6 == s7) {
                            pj9 pj9Var = new pj9();
                            int iA3 = pj9Var.a(byteBuffer, s7, 0);
                            if (jfkVar == jfk.new_session_ticket) {
                                if (iA3 != 4) {
                                    p51.g("invalid extension data length");
                                    return arrayList;
                                }
                                pj9Var.a = Long.valueOf(((long) byteBuffer.getInt()) & 4294967295L);
                            } else if (iA3 != 0) {
                                p51.g("invalid extension data length");
                                return arrayList;
                            }
                            arrayList3.add(pj9Var);
                        } else if (i6 == ifk.supported_versions.a) {
                            arrayList3.add(new pbj(byteBuffer, jfkVar));
                        } else if (i6 == ifk.psk_key_exchange_modes.a) {
                            arrayList3.add(new q3e(byteBuffer, 0));
                        } else if (i6 == ifk.certificate_authorities.a) {
                            arrayList3.add(new ov8(byteBuffer));
                        } else {
                            ifk ifkVar3 = ifk.key_share;
                            if (i6 == ifkVar3.a) {
                                zkc zkcVar = new zkc();
                                zkcVar.b = new ArrayList();
                                int iA4 = zkcVar.a(byteBuffer, ifkVar3.a, 1);
                                if (iA4 < 2) {
                                    p51.g("extension underflow");
                                    return arrayList;
                                }
                                if (jfkVar == jfk.client_hello) {
                                    int iC = byteBuffer.getShort();
                                    if (iA4 != iC + 2) {
                                        p51.g("inconsistent length");
                                        return arrayList;
                                    }
                                    while (iC > 0) {
                                        iC -= zkcVar.c(byteBuffer);
                                    }
                                    if (iC != 0) {
                                        p51.g("inconsistent length");
                                        return arrayList;
                                    }
                                } else {
                                    if (jfkVar != jfk.server_hello) {
                                        ore.a();
                                        return arrayList;
                                    }
                                    if (iA4 - zkcVar.c(byteBuffer) != 0) {
                                        p51.g("inconsistent length");
                                        return arrayList;
                                    }
                                }
                                arrayList3.add(zkcVar);
                            } else {
                                if (atjVar != 0) {
                                    d5k d5kVar = (d5k) atjVar.b;
                                    short s8 = byteBuffer.getShort();
                                    int i12 = s8 & s4;
                                    int i13 = d5kVar.a.a.a;
                                    if (i13 == 1 || i13 == 1798521807 ? i12 != 57 : i12 != 65445) {
                                        obj = arrayList;
                                    } else {
                                        e8k e8kVar = d5kVar.a.a;
                                        fbk fbkVar = new fbk(e8kVar);
                                        c8k c8kVar = fbkVar.d;
                                        int i14 = byteBuffer.getShort() & s4;
                                        int i15 = e8kVar.a;
                                        if (i15 == 1 || i15 == 1798521807) {
                                            if (i14 != 57) {
                                                hs4.b();
                                                return arrayList;
                                            }
                                            s = byteBuffer.getShort();
                                            iPosition = byteBuffer.position();
                                            hashSet = new HashSet();
                                            while (byteBuffer.position() - iPosition < s) {
                                                try {
                                                    jH = ti8.h(byteBuffer);
                                                    if (hashSet.add(Long.valueOf(jH))) {
                                                        throw new bJ(9, "duplicate transport parameter");
                                                    }
                                                    iE = ti8.e(byteBuffer);
                                                    if (byteBuffer.remaining() >= iE) {
                                                        throw new j("Invalid transport parameter extension");
                                                    }
                                                    iPosition2 = byteBuffer.position();
                                                    if (jH == 0) {
                                                        byte[] bArr2 = new byte[iE];
                                                        byteBuffer.get(bArr2);
                                                        c8kVar.a = bArr2;
                                                    } else if (jH == 1) {
                                                        c8kVar.b = ti8.h(byteBuffer);
                                                    } else if (jH == 2) {
                                                        byte[] bArr3 = new byte[16];
                                                        byteBuffer.get(bArr3);
                                                        nl9.a(bArr3);
                                                        c8kVar.q = bArr3;
                                                    } else if (jH == 3) {
                                                        c8kVar.p = ti8.e(byteBuffer);
                                                    } else if (jH == 4) {
                                                        c8kVar.c = ti8.h(byteBuffer);
                                                    } else if (jH == 5) {
                                                        c8kVar.d = ti8.h(byteBuffer);
                                                    } else if (jH == 6) {
                                                        c8kVar.e = ti8.h(byteBuffer);
                                                    } else if (jH == 7) {
                                                        c8kVar.f = ti8.h(byteBuffer);
                                                    } else if (jH == 8) {
                                                        c8kVar.g = ti8.h(byteBuffer);
                                                    } else if (jH == 9) {
                                                        c8kVar.h = ti8.h(byteBuffer);
                                                    } else if (jH == 10) {
                                                        c8kVar.i = ti8.e(byteBuffer);
                                                    } else if (jH == 11) {
                                                        c8kVar.l = ti8.e(byteBuffer);
                                                    } else if (jH == 12) {
                                                        c8kVar.j = true;
                                                    } else if (jH == 13) {
                                                        fbkVar.d(byteBuffer);
                                                    } else if (jH == 14) {
                                                        c8kVar.m = (int) ti8.h(byteBuffer);
                                                    } else if (jH == 15) {
                                                        byte[] bArr4 = new byte[iE];
                                                        byteBuffer.get(bArr4);
                                                        nl9.a(bArr4);
                                                        c8kVar.n = bArr4;
                                                    } else {
                                                        if (jH == 16) {
                                                            byte[] bArr5 = new byte[iE];
                                                            byteBuffer.get(bArr5);
                                                            nl9.a(bArr5);
                                                            c8kVar.o = bArr5;
                                                        } else if (jH == 17) {
                                                            if (iE % 4 == 0 || iE < 4) {
                                                                throw new j("invalid parameters size");
                                                            }
                                                            int i16 = byteBuffer.getInt();
                                                            ArrayList arrayList5 = new ArrayList();
                                                            for (int i17 = 0; i17 < (iE / 4) - 1; i17++) {
                                                                arrayList5.add(new e8k(byteBuffer.getInt()));
                                                            }
                                                            c8kVar.r = new h6f(new e8k(i16), 12, arrayList5);
                                                        } else if (jH == 32) {
                                                            c8kVar.s = ti8.h(byteBuffer);
                                                        } else {
                                                            str = jH == 32 ? "datagram" : "";
                                                            if (jH == 64) {
                                                                str = "multi-path";
                                                            }
                                                            if (jH == 4183) {
                                                                str = "loss-bits";
                                                            }
                                                            if (jH == 5950) {
                                                                str = ClientCookie.DISCARD_ATTR;
                                                            }
                                                            if (jH == 10930) {
                                                                str = "grease-quic-bit";
                                                            }
                                                            if (jH == 29015) {
                                                                str = "timestamp";
                                                            }
                                                            str2 = jH != 29016 ? str : "timestamp";
                                                            if (jH == 29659) {
                                                                str2 = "version-negotiation";
                                                            }
                                                            str3 = "delayed-ack";
                                                            if (jH == 56858) {
                                                                str2 = "delayed-ack";
                                                            }
                                                            if (jH == 16741339) {
                                                                str2 = "version-information-4-13";
                                                            }
                                                            if (jH == 4278378010L) {
                                                                str3 = str2;
                                                            }
                                                            length = str3.length();
                                                            iCharCount = 0;
                                                            while (true) {
                                                                if (iCharCount < length) {
                                                                    z = true;
                                                                    break;
                                                                }
                                                                iCodePointAt = str3.codePointAt(iCharCount);
                                                                if (!Character.isWhitespace(iCodePointAt)) {
                                                                    z = false;
                                                                    break;
                                                                }
                                                                iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                                                            }
                                                            if (z) {
                                                                String.format("- unknown transport parameter 0x%04x, size %d", Long.valueOf(jH), Integer.valueOf(iE));
                                                            } else {
                                                                String.format("- unsupported transport parameter 0x%04x, size %d (%s)", Long.valueOf(jH), Integer.valueOf(iE), str3);
                                                            }
                                                            byteBuffer.get(new byte[iE]);
                                                        }
                                                        if (byteBuffer.position() - iPosition2 == iE) {
                                                            throw new j("inconsistent size in transport parameter");
                                                        }
                                                    }
                                                    if (byteBuffer.position() - iPosition2 == iE) {
                                                        throw new j("inconsistent size in transport parameter");
                                                    }
                                                } catch (bJ e) {
                                                    throw new g(e.getMessage(), e);
                                                } catch (bq unused) {
                                                    p51.g("invalid integer encoding in transport parameter extension");
                                                    return arrayList;
                                                }
                                            }
                                            obj = fbkVar;
                                            if (byteBuffer.position() - iPosition != s) {
                                                p51.g("inconsistent size in transport parameter extension");
                                                return arrayList;
                                            }
                                        } else {
                                            if (i14 != 65445) {
                                                hs4.b();
                                                return arrayList;
                                            }
                                            s = byteBuffer.getShort();
                                            iPosition = byteBuffer.position();
                                            hashSet = new HashSet();
                                            while (byteBuffer.position() - iPosition < s) {
                                                jH = ti8.h(byteBuffer);
                                                if (hashSet.add(Long.valueOf(jH))) {
                                                    throw new bJ(9, "duplicate transport parameter");
                                                }
                                                iE = ti8.e(byteBuffer);
                                                if (byteBuffer.remaining() >= iE) {
                                                    throw new j("Invalid transport parameter extension");
                                                }
                                                iPosition2 = byteBuffer.position();
                                                if (jH == 0) {
                                                    byte[] bArr6 = new byte[iE];
                                                    byteBuffer.get(bArr6);
                                                    c8kVar.a = bArr6;
                                                } else if (jH == 1) {
                                                    c8kVar.b = ti8.h(byteBuffer);
                                                } else if (jH == 2) {
                                                    byte[] bArr7 = new byte[16];
                                                    byteBuffer.get(bArr7);
                                                    nl9.a(bArr7);
                                                    c8kVar.q = bArr7;
                                                } else if (jH == 3) {
                                                    c8kVar.p = ti8.e(byteBuffer);
                                                } else if (jH == 4) {
                                                    c8kVar.c = ti8.h(byteBuffer);
                                                } else if (jH == 5) {
                                                    c8kVar.d = ti8.h(byteBuffer);
                                                } else if (jH == 6) {
                                                    c8kVar.e = ti8.h(byteBuffer);
                                                } else if (jH == 7) {
                                                    c8kVar.f = ti8.h(byteBuffer);
                                                } else if (jH == 8) {
                                                    c8kVar.g = ti8.h(byteBuffer);
                                                } else if (jH == 9) {
                                                    c8kVar.h = ti8.h(byteBuffer);
                                                } else if (jH == 10) {
                                                    c8kVar.i = ti8.e(byteBuffer);
                                                } else if (jH == 11) {
                                                    c8kVar.l = ti8.e(byteBuffer);
                                                } else if (jH == 12) {
                                                    c8kVar.j = true;
                                                } else if (jH == 13) {
                                                    fbkVar.d(byteBuffer);
                                                } else if (jH == 14) {
                                                    c8kVar.m = (int) ti8.h(byteBuffer);
                                                } else if (jH == 15) {
                                                    byte[] bArr8 = new byte[iE];
                                                    byteBuffer.get(bArr8);
                                                    nl9.a(bArr8);
                                                    c8kVar.n = bArr8;
                                                } else {
                                                    if (jH == 16) {
                                                        byte[] bArr9 = new byte[iE];
                                                        byteBuffer.get(bArr9);
                                                        nl9.a(bArr9);
                                                        c8kVar.o = bArr9;
                                                    } else {
                                                        if (jH == 17) {
                                                            if (iE % 4 == 0) {
                                                            }
                                                            throw new j("invalid parameters size");
                                                        }
                                                        if (jH == 32) {
                                                            c8kVar.s = ti8.h(byteBuffer);
                                                        } else {
                                                            if (jH == 32) {
                                                            }
                                                            if (jH == 64) {
                                                                str = "multi-path";
                                                            }
                                                            if (jH == 4183) {
                                                                str = "loss-bits";
                                                            }
                                                            if (jH == 5950) {
                                                                str = ClientCookie.DISCARD_ATTR;
                                                            }
                                                            if (jH == 10930) {
                                                                str = "grease-quic-bit";
                                                            }
                                                            if (jH == 29015) {
                                                                str = "timestamp";
                                                            }
                                                            if (jH != 29016) {
                                                            }
                                                            if (jH == 29659) {
                                                                str2 = "version-negotiation";
                                                            }
                                                            str3 = "delayed-ack";
                                                            if (jH == 56858) {
                                                                str2 = "delayed-ack";
                                                            }
                                                            if (jH == 16741339) {
                                                                str2 = "version-information-4-13";
                                                            }
                                                            if (jH == 4278378010L) {
                                                                str3 = str2;
                                                            }
                                                            length = str3.length();
                                                            iCharCount = 0;
                                                            while (true) {
                                                                if (iCharCount < length) {
                                                                    z = true;
                                                                    break;
                                                                }
                                                                iCodePointAt = str3.codePointAt(iCharCount);
                                                                if (!Character.isWhitespace(iCodePointAt)) {
                                                                    z = false;
                                                                    break;
                                                                }
                                                                iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                                                            }
                                                            if (z) {
                                                                String.format("- unknown transport parameter 0x%04x, size %d", Long.valueOf(jH), Integer.valueOf(iE));
                                                            } else {
                                                                String.format("- unsupported transport parameter 0x%04x, size %d (%s)", Long.valueOf(jH), Integer.valueOf(iE), str3);
                                                            }
                                                            byteBuffer.get(new byte[iE]);
                                                        }
                                                    }
                                                    if (byteBuffer.position() - iPosition2 == iE) {
                                                        throw new j("inconsistent size in transport parameter");
                                                    }
                                                }
                                                if (byteBuffer.position() - iPosition2 == iE) {
                                                    throw new j("inconsistent size in transport parameter");
                                                }
                                            }
                                            obj = fbkVar;
                                            if (byteBuffer.position() - iPosition != s) {
                                                p51.g("inconsistent size in transport parameter extension");
                                                return arrayList;
                                            }
                                        }
                                    }
                                } else {
                                    obj = arrayList;
                                }
                                if (obj != null) {
                                    arrayList3.add(obj);
                                } else {
                                    z0k z0kVar = new z0k();
                                    if (byteBuffer.remaining() < 4) {
                                        p51.g("Extension must be at least 4 bytes long");
                                        return arrayList;
                                    }
                                    byteBuffer.getShort();
                                    int i18 = byteBuffer.getShort() & s4;
                                    if (byteBuffer.remaining() < i18) {
                                        p51.g("Invalid extension length");
                                        return arrayList;
                                    }
                                    byteBuffer.get(new byte[i18 + 4]);
                                    arrayList3.add(z0kVar);
                                }
                            }
                        }
                    } else if (jfkVar == jfk.server_hello) {
                        kgh kghVar = new kgh();
                        kghVar.a(byteBuffer, s6, 2);
                        kghVar.a = byteBuffer.getShort();
                        arrayList3.add(kghVar);
                    } else {
                        if (jfkVar != jfk.client_hello) {
                            throw new n(c0a.n(Arrays.stream(jfk.values()).filter(new u6(21, jfkVar)).findFirst().get(), "Extension not allowed in "));
                        }
                        qx8 qx8Var = new qx8();
                        int iPosition4 = byteBuffer.position();
                        int iA5 = qx8Var.a(byteBuffer, ifkVar2.a, 44);
                        qx8Var.a = new ArrayList();
                        int i19 = byteBuffer.getShort() & s4;
                        int i20 = 2;
                        int i21 = iA5 - 2;
                        while (i19 > 0) {
                            if (i21 < i20) {
                                ArrayList arrayList6 = arrayList2;
                                p51.g("Incomplete psk identity");
                                return arrayList6;
                            }
                            int i22 = byteBuffer.getShort() & s4;
                            int i23 = i21 - 2;
                            if (i22 > i23) {
                                ArrayList arrayList7 = arrayList2;
                                p51.g("Incorrect identity length value");
                                return arrayList7;
                            }
                            byte[] bArr10 = new byte[i22];
                            byteBuffer.get(bArr10);
                            int i24 = i23 - i22;
                            if (i24 < i5) {
                                ArrayList arrayList8 = arrayList2;
                                p51.g("Incomplete psk identity");
                                return arrayList8;
                            }
                            qx8Var.a.add(new ox8(byteBuffer.getInt(), bArr10));
                            i19 -= i22 + 6;
                            arrayList2 = arrayList2;
                            i21 = i24 - 4;
                            i8 = i8;
                            i5 = 4;
                            i20 = 2;
                        }
                        arrayList = arrayList2;
                        i = i8;
                        if (i19 != 0) {
                            p51.g("Incorrect identities length value");
                            return arrayList;
                        }
                        qx8Var.c = byteBuffer.position() - iPosition4;
                        qx8Var.b = new ArrayList();
                        if (i21 < 2) {
                            p51.g("Incomplete binders");
                            return arrayList;
                        }
                        int i25 = byteBuffer.getShort() & s4;
                        int i26 = i21 - 2;
                        while (i25 > 0) {
                            if (i26 <= 0) {
                                p51.g("Incorrect binder value");
                                return arrayList;
                            }
                            int i27 = byteBuffer.get() & 255;
                            int i28 = i26 - 1;
                            if (i27 > i28) {
                                p51.g("Incorrect binder length value");
                                return arrayList;
                            }
                            if (i27 < 32) {
                                p51.g("Invalid binder length");
                                return arrayList;
                            }
                            byte[] bArr11 = new byte[i27];
                            byteBuffer.get(bArr11);
                            i26 = i28 - i27;
                            qx8Var.b.add(new nx8(bArr11));
                            i25 -= i27 + 1;
                        }
                        if (i25 != 0) {
                            p51.g("Incorrect binders length value");
                            return arrayList;
                        }
                        if (i26 > 0) {
                            p51.g("Incorrect extension data length value");
                            return arrayList;
                        }
                        if (qx8Var.a.size() != qx8Var.b.size()) {
                            p51.g("Inconsistent number of identities vs binders");
                            return arrayList;
                        }
                        if (qx8Var.a.size() == 0) {
                            p51.g("Empty OfferedPsks");
                            return arrayList;
                        }
                        arrayList3.add(qx8Var);
                    }
                    if (byteBuffer.position() - iPosition3 == i7 + 4) {
                        p51.g("Incorrect extension length");
                        return arrayList;
                    }
                    i4 = i - i7;
                    s2 = s4;
                    arrayList2 = arrayList;
                    i3 = 2;
                }
            }
            arrayList = arrayList2;
            i = i8;
            if (byteBuffer.position() - iPosition3 == i7 + 4) {
                p51.g("Incorrect extension length");
                return arrayList;
            }
            i4 = i - i7;
            s2 = s4;
            arrayList2 = arrayList;
            i3 = 2;
        }
    }

    public final int a(ByteBuffer byteBuffer, jfk jfkVar, int i) {
        if (byteBuffer.remaining() < 4) {
            p51.g("handshake message underflow");
            return 0;
        }
        if ((byteBuffer.get() & 255) != jfkVar.a) {
            c.t();
            return 0;
        }
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        if (i2 + 4 >= i) {
            if (byteBuffer.remaining() >= i2) {
                return i2;
            }
            p51.g("handshake message underflow");
            return 0;
        }
        throw new j(getClass().getSimpleName() + " can't be less than " + i + " bytes");
    }

    public abstract jfk b();

    public abstract byte[] d();
}
