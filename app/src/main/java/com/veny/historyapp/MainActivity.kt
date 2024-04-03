package com.veny.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialize
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)

        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20 ..<100) {
                val FamousPerson = when (age) {
                    20-> "  Heath Ledger When hunky, twenty-year-old heart-throb Heath Ledger first came to the attention of the public in 1999, it was all too easy to tag him as a pretty boy and an actor of little depth. He spent several years trying desperately to sway this image, but this was a double-edged sword. His work comprised ..."
                    30 -> "Bob Marley Bob Marley was born on February 6, 1945, in Nine Miles, Saint Ann, Jamaica, to Norval Marley and Cedella Booker. His father was a Jamaican of English descent. His mother was a black teenager. The couple were married in 1944 but Norval left for Kingston immediately after. "
                    40 -> " Elvis Presley Elvis Aaron Presley was born on January 8, 1935 in East Tupelo, Mississippi, to Gladys Presley (née Gladys Love Smith) and Vernon Presley (Vernon Elvis Presley). He had a twin brother who was stillborn. In 1948, Elvis and his parents moved to Memphis, Tennessee where he attended Humes High School"
                    50 -> "Michael Jackson Michael Joseph Jackson was born on August 29, 1958 in Gary, Indiana, and entertained audiences nearly his entire life. His father, Joe Jackson (no relation to Joe Jackson, also a musician), had been a guitarist, but was forced to give up his musical ambitions following his marriage to Michael's "
                    60 -> " Bill Paxton Bill Paxton was born on May 17, 1955 in Fort Worth, Texas. He was the son of Mary Lou (Gray) and John Lane Paxton, a businessman and actor (as John Paxton). Bill moved to Los Angeles, California at age eighteen, where he found work in the film industry as a set dresser for Roger Corman's New World"
                    70 -> " David Bowie David Bowie was one of the most influential and prolific writers and performers of popular music, but he was much more than that; he was also an accomplished actor, a mime and an intellectual"
                    80 -> " Don Adams Don Adams was born in New York, to a father of Hungarian Jewish descent, and a mother of German and Irish ancestry. He had a sister, Gloria, and a brother, Dick Yarmy. He served in the U.S. Marines in World War II and contracted malaria during the fighting on Guadalcanal island. "
                    90 -> "Winston Churchill British Prime Minister during World War II who encouraged bravery and endurance. He became the first Honorary Citizen of the United States and later the first British Prime Minister to win the Nobel Prize in Literature."
                    100 -> "Charlie Trippi Hall of Fame halfback, and quarterback who played in the Chicago Cardinals' Dream Backfield in the 1940s and '50s. His last year playing with the Cardinals was 1955. He amassed 23 rushing touchdowns throughout his professional career."
                    else -> null
                }
                val message = if (FamousPerson != null) "The famous persons name is $FamousPerson"
                else "No employee found with the entered age"
                resultTextView.text = message

            }else{
                resultTextView.text = ""
            }
            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""
            }
        }
    }
}