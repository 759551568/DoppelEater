/*
 * This file is generated by jOOQ.
*/
package com.doppelgunner.doppeleater.database.generated;


import com.doppelgunner.doppeleater.database.generated.tables.Eaten;
import com.doppelgunner.doppeleater.database.generated.tables.Eater;
import com.doppelgunner.doppeleater.database.generated.tables.SqliteSequence;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>eaten</code>.
     */
    public static final Eaten EATEN = com.doppelgunner.doppeleater.database.generated.tables.Eaten.EATEN;

    /**
     * The table <code>eater</code>.
     */
    public static final Eater EATER = com.doppelgunner.doppeleater.database.generated.tables.Eater.EATER;

    /**
     * The table <code>sqlite_sequence</code>.
     */
    public static final SqliteSequence SQLITE_SEQUENCE = com.doppelgunner.doppeleater.database.generated.tables.SqliteSequence.SQLITE_SEQUENCE;
}