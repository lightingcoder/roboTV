package org.xvdr.recordings.model;

import org.xvdr.jniwrap.Packet;

public class PacketAdapter {

    public static Movie toMovie(Packet p) {

        long timeStamp = p.getU32() * 1000L;    // timestamp
        int duration = (int)p.getU32();         // duration
        p.getU32();                             // Priority
        p.getU32();                             // Lifetime
        String channelName = p.getString();     // channel name
        String title = p.getString();           // title
        String outline = p.getString();         // outline
        String plot = p.getString();            // plot
        String folder = p.getString();          // folder
        String recId = p.getString();           // recording id
        int playCount = (int)p.getU32();        // playcount
        int content = (int)p.getU32();          // content
        String posterUrl = p.getString();       // poster url
        String backgroundUrl = p.getString();   // background url

        Movie movie = new Movie(content, title, outline, plot, duration);

        if(title.equals(outline) || outline.isEmpty()) {
            movie.setShortText(movie.getDate());
        }

        movie.setTimeStamp(timeStamp);
        movie.setFolder(folder); // directory / folder
        movie.setChannelName(channelName);
        movie.setRecordingId(recId);
        movie.setPlayCount(playCount);
        movie.setPosterUrl(posterUrl);
        movie.setBackgroundUrl(backgroundUrl);

        return movie;
    }
}
