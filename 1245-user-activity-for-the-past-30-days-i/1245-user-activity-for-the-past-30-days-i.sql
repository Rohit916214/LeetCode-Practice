SELECT 
    activity_date AS day, 
    COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY activity_date;





/*

        | Data Type           | Example Value            | SQL me kaise likhna hai | Notes                                     |
| ------------------- | ------------------------ | ----------------------- | ----------------------------------------- |
| **String (text)**   | `Hello`                  | `'Hello'`               | Always single quotes me                   |
| **Date**            | `2019-07-27`             | `'2019-07-27'`          | Dates bhi string ki tarah treat hote hain |
| **Datetime**        | `2019-07-27 10:30:00`    | `'2019-07-27 10:30:00'` | Single quotes me likhna zaroori           |
| **Number (int)**    | `123`                    | `123`                   | Quotes nahi chahiye                       |
| **Decimal/Float**   | `45.67`                  | `45.67`                 | Quotes nahi chahiye                       |
| **Boolean** (MySQL) | `1` (true) / `0` (false) | `1` ya `0`              | MySQL me direct likh sakte ho             |

*/


